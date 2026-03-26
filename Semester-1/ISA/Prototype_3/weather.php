<?php
header('Content-Type: application/json');

$host = "localhost";
$username = "root";
$password = "";
$dbname = "weather_db";

// $host = "rohit-weather.gt.tc";
// $username = "if0_40995037";
// $password = "3rUzZ1Xro0Qdyu";
// $dbname = "if0_40995037_db_weather";

// Connect to DB
$conn = new mysqli($host, $username, $password, $dbname);
if ($conn->connect_error) {
    echo json_encode(["error" => "Database error"]);
    exit;
}

$apiKey = "474b8d92e02497bc5dea323ab646b3af";
$city = $_GET["city"] ?? "";

if ($city == "") {
    echo json_encode(["error" => "City missing"]);
    exit;
}

// Escape city to prevent SQL injection
$cityEscaped = $conn->real_escape_string($city);

// Check cache (2 hours)
$result = $conn->query(
    "SELECT weather_json, last_updated FROM weather_cache WHERE city='$cityEscaped'"
);

if ($row = $result->fetch_assoc()) {
    if (time() - strtotime($row["last_updated"]) < 7200) {
        echo $row["weather_json"];
        exit;
    }
}

// Call OpenWeatherMap API
$url = "https://api.openweathermap.org/data/2.5/weather?q=$cityEscaped&appid=$apiKey&units=metric";
$data = file_get_contents($url);

if (!$data) {
    echo json_encode(["error" => "API failed"]);
    exit;
}

// Decode API response
$apiResponse = json_decode($data, true);

// Check for invalid city
if (isset($apiResponse['cod']) && $apiResponse['cod'] == '404') {
    echo json_encode(["error" => "City not found"]);
    exit;
}

// Save/update cache only if city is valid
$conn->query(
    "REPLACE INTO weather_cache (city, weather_json, last_updated) VALUES ('$cityEscaped', '$data', NOW())"
);

echo $data;
