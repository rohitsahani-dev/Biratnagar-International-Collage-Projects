<?php
$host = "localhost";
$user = "root";
$pass = "";
$db   = "weather_db";

/* Connect to MySQL */
$conn = new mysqli($host, $user, $pass);

if ($conn->connect_error) {
    die("Database connection failed");
}

/* Create database */
$conn->query("CREATE DATABASE IF NOT EXISTS weather_db");

/* Use database */
$conn->select_db("weather_db");

/* Create table */
$conn->query("
    CREATE TABLE IF NOT EXISTS weather_cache (
        city VARCHAR(100) PRIMARY KEY,
        weather_json MEDIUMTEXT,
        last_updated DATETIME
    )
");
