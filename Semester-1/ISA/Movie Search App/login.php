<?php
session_start();
include "connection.php";

$email = $_POST['email'];
$password = $_POST['password'];

$result = mysqli_query(
    $conn,
    "SELECT * FROM users WHERE email='$email'"
);

$user = mysqli_fetch_assoc($result);

if ($user && password_verify($password, $user['password'])) {
    $_SESSION['login'] = true;
    header("Location: index.php");
    exit;
} else {
    echo "Wrong email or password";
}
