-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2026 at 09:43 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `weather_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `weather_cache`
--

CREATE TABLE `weather_cache` (
  `city` varchar(100) NOT NULL,
  `weather_json` mediumtext DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `weather_cache`
--

INSERT INTO `weather_cache` (`city`, `weather_json`, `last_updated`) VALUES
('1111', '{\"coord\":{\"lon\":12.5701,\"lat\":55.6867},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":-0.3,\"feels_like\":-6.6,\"temp_min\":-0.82,\"temp_max\":-0.06,\"pressure\":1003,\"humidity\":84,\"sea_level\":1003,\"grnd_level\":1002},\"visibility\":10000,\"wind\":{\"speed\":7.72,\"deg\":50},\"clouds\":{\"all\":100},\"dt\":1769433790,\"sys\":{\"type\":2,\"id\":2035645,\"country\":\"DK\",\"sunrise\":1769411652,\"sunset\":1769441398},\"timezone\":3600,\"id\":2618425,\"name\":\"Copenhagen\",\"cod\":200}', '2026-01-26 19:08:19'),
('3333', '{\"coord\":{\"lon\":14.7093,\"lat\":48.0295},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":3.89,\"feels_like\":3.89,\"temp_min\":3.89,\"temp_max\":3.89,\"pressure\":1003,\"humidity\":87,\"sea_level\":1003,\"grnd_level\":946},\"visibility\":10000,\"wind\":{\"speed\":1.14,\"deg\":339,\"gust\":2.4},\"clouds\":{\"all\":69},\"dt\":1769433768,\"sys\":{\"country\":\"AT\",\"sunrise\":1769409392,\"sunset\":1769442631},\"timezone\":3600,\"id\":7871689,\"name\":\"Biberbach\",\"cod\":200}', '2026-01-26 19:07:56'),
('bihar', '{\"coord\":{\"lon\":21.9167,\"lat\":47.15},\"weather\":[{\"id\":502,\"main\":\"Rain\",\"description\":\"heavy intensity rain\",\"icon\":\"10d\"}],\"base\":\"stations\",\"main\":{\"temp\":7.28,\"feels_like\":5.97,\"temp_min\":7.06,\"temp_max\":7.28,\"pressure\":1000,\"humidity\":93,\"sea_level\":1000,\"grnd_level\":986},\"visibility\":9000,\"wind\":{\"speed\":2.06,\"deg\":50},\"rain\":{\"1h\":9.45},\"clouds\":{\"all\":75},\"dt\":1769436472,\"sys\":{\"type\":2,\"id\":50396,\"country\":\"RO\",\"sunrise\":1769407501,\"sunset\":1769441062},\"timezone\":7200,\"id\":684882,\"name\":\"Biharia\",\"cod\":200}', '2026-01-26 19:54:37'),
('biratnagar', '{\"coord\":{\"lon\":87.2834,\"lat\":26.4831},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":25.79,\"feels_like\":25.23,\"temp_min\":25.79,\"temp_max\":25.79,\"pressure\":1016,\"humidity\":31,\"sea_level\":1016,\"grnd_level\":1007},\"visibility\":10000,\"wind\":{\"speed\":1.86,\"deg\":208,\"gust\":1.5},\"clouds\":{\"all\":65},\"dt\":1769503097,\"sys\":{\"country\":\"NP\",\"sunrise\":1769475475,\"sunset\":1769514534},\"timezone\":20700,\"id\":1283582,\"name\":\"Biratnagar\",\"cod\":200}', '2026-01-27 14:26:36'),
('kathmandu', '{\"coord\":{\"lon\":85.3167,\"lat\":27.7167},\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"base\":\"stations\",\"main\":{\"temp\":19.12,\"feels_like\":18.11,\"temp_min\":19.12,\"temp_max\":19.12,\"pressure\":1010,\"humidity\":39,\"sea_level\":1010,\"grnd_level\":849},\"visibility\":6000,\"wind\":{\"speed\":1.54,\"deg\":260},\"clouds\":{\"all\":20},\"dt\":1768724478,\"sys\":{\"type\":1,\"id\":9201,\"country\":\"NP\",\"sunrise\":1768698618,\"sunset\":1768736839},\"timezone\":20700,\"id\":1283240,\"name\":\"Kathmandu\",\"cod\":200}', '2026-01-18 14:17:47'),
('london', '{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"base\":\"stations\",\"main\":{\"temp\":6.4,\"feels_like\":1.63,\"temp_min\":5.86,\"temp_max\":7.32,\"pressure\":984,\"humidity\":90,\"sea_level\":984,\"grnd_level\":980},\"visibility\":10000,\"wind\":{\"speed\":9.26,\"deg\":120,\"gust\":14.4},\"rain\":{\"1h\":0.64},\"clouds\":{\"all\":100},\"dt\":1769503088,\"sys\":{\"type\":2,\"id\":268730,\"country\":\"GB\",\"sunrise\":1769499979,\"sunset\":1769531992},\"timezone\":0,\"id\":2643743,\"name\":\"London\",\"cod\":200}', '2026-01-27 14:26:25'),
('Newcastle', '{\"coord\":{\"lon\":151.7765,\"lat\":-32.9272},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"base\":\"stations\",\"main\":{\"temp\":22.5,\"feels_like\":22.53,\"temp_min\":21.89,\"temp_max\":22.87,\"pressure\":1012,\"humidity\":66,\"sea_level\":1012,\"grnd_level\":1012},\"visibility\":10000,\"wind\":{\"speed\":3.09,\"deg\":80},\"clouds\":{\"all\":0},\"dt\":1769503251,\"sys\":{\"type\":2,\"id\":2009459,\"country\":\"AU\",\"sunrise\":1769454648,\"sunset\":1769504399},\"timezone\":39600,\"id\":2155472,\"name\":\"Newcastle\",\"cod\":200}', '2026-01-27 14:26:02'),
('pokhara', '{\"coord\":{\"lon\":83.9833,\"lat\":28.2333},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"base\":\"stations\",\"main\":{\"temp\":22.15,\"feels_like\":21.1,\"temp_min\":22.15,\"temp_max\":22.15,\"pressure\":1016,\"humidity\":26,\"sea_level\":1016,\"grnd_level\":874},\"visibility\":10000,\"wind\":{\"speed\":3.32,\"deg\":153,\"gust\":1.97},\"clouds\":{\"all\":3},\"dt\":1769503091,\"sys\":{\"country\":\"NP\",\"sunrise\":1769476443,\"sunset\":1769515149},\"timezone\":20700,\"id\":1282898,\"name\":\"Pokhara\",\"cod\":200}', '2026-01-27 14:26:16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `weather_cache`
--
ALTER TABLE `weather_cache`
  ADD PRIMARY KEY (`city`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
