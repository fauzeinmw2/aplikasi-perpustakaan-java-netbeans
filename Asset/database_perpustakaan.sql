-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 28, 2021 at 11:34 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `NIM` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `TTL` varchar(10) NOT NULL,
  `Jenis_Kelamin` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Kelas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`NIM`, `Nama`, `TTL`, `Jenis_Kelamin`, `Alamat`, `Kelas`) VALUES
('122003', 'Siti Mawar', '03 10 2003', 'Perempuan', 'Gunung Pengilun', 'X RPL');

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE `data_buku` (
  `Kode_Buku` varchar(10) NOT NULL,
  `Nama_Buku` varchar(50) NOT NULL,
  `Nama_Pengarang` varchar(20) NOT NULL,
  `Penerbit` varchar(20) NOT NULL,
  `Tahun_Terbit` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`Kode_Buku`, `Nama_Buku`, `Nama_Pengarang`, `Penerbit`, `Tahun_Terbit`) VALUES
('A1', 'PBO XI RPL', 'Patwiyanto, S.Kom', 'Erlangga', '2018');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Nama` varchar(30) NOT NULL,
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `KonfirmasiPassword` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Nama`, `Username`, `Password`, `KonfirmasiPassword`) VALUES
('Fauzein Mulya Warman', '021203', '12345', '12345'),
('Budi Hartono', '122003', '54321', '54321');

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `NIM` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Kode_Buku` varchar(10) NOT NULL,
  `Nama_Buku` varchar(50) NOT NULL,
  `Tanggal_Peminjaman` varchar(12) NOT NULL,
  `Tanggal_Pengembalian` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjam`
--

INSERT INTO `peminjam` (`NIM`, `Nama`, `Kode_Buku`, `Nama_Buku`, `Tanggal_Peminjaman`, `Tanggal_Pengembalian`) VALUES
('122003', 'Budi Hartono', 'A2', 'PWEB XII RPL', '28 03 2021', '10 04 2021');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`Kode_Buku`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`NIM`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
