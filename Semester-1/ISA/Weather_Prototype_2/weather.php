<?php
require "db.php";
header("Content-Type: application/json");

$apiKey = "474b8d92e02497bc5dea323ab646b3af";
$city = $_GET["city"] ?? "";

if ($city === "") {
    echo json_encode(["error" => "City name missing"]);
    exit;
}

/* 1. Check database */
$result = $conn->query(
    "SELECT weather_json, last_updated 
     FROM weather_cache 
     WHERE city = '$city'"
);

if ($row = $result->fetch_assoc()) {
    $age = time() - strtotime($row["last_updated"]);

    if ($age < 600) {
        echo $row["weather_json"];
        exit;
    }
}

/* 2. Call OpenWeather API */
$url = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey&units=metric";
$data = file_get_contents($url);

if (!$data) {
    echo json_encode(["error" => "API failed"]);
    exit;
}

/* 3. Save to database */
$conn->query(
    "REPLACE INTO weather_cache (city, weather_json, last_updated)
     VALUES ('$city', '$data', NOW())"
);

/* 4. Send data */
echo $data;
