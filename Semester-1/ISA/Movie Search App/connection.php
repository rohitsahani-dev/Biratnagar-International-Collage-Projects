<?php

$host = "localhost";
$user = "root";
$pass = "";


$conn = mysqli_connect($host, $user, $pass);

if (!$conn) {
    die("Connection failed");
}


$sql = "CREATE DATABASE IF NOT EXISTS movie_app";
mysqli_query($conn, $sql);


mysqli_select_db($conn, "movie_app");


$table = "
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100),
    password VARCHAR(255)
)";
mysqli_query($conn, $table);

echo "Database and table created successfully";
