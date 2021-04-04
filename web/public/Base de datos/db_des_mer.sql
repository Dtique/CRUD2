-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-04-2021 a las 23:20:17
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_des_mer`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cli` int(11) NOT NULL,
  `nom_cli` varchar(20) DEFAULT NULL,
  `dir_cli` varchar(50) DEFAULT NULL,
  `corr_cli` varchar(50) DEFAULT NULL,
  `tel_cli` varchar(10) DEFAULT NULL,
  `acc_cli` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cli`, `nom_cli`, `dir_cli`, `corr_cli`, `tel_cli`, `acc_cli`) VALUES
(87, 'JUAN CAMILO', 'ccsadsa', 'nojnonj@dsdasd', '310853', NULL),
(88, 'ddd', 'calle58 sur 98 c 16', 'nojnonj@dsdasd', '3108530547', NULL),
(89, 'JUAN ', 'ccsadsa', 'diego_T@hotmail.xom', '3332223', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cor_despac`
--

CREATE TABLE `cor_despac` (
  `id_cord` int(11) NOT NULL,
  `nom_cor` varchar(20) DEFAULT NULL,
  `tel_cor` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cor_despac`
--

INSERT INTO `cor_despac` (`id_cord`, `nom_cor`, `tel_cor`) VALUES
(33, '444', '4444444');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `doc_emp` varchar(15) NOT NULL,
  `nom_emp` varchar(15) DEFAULT NULL,
  `tel_emp` varchar(10) DEFAULT NULL,
  `dir_emp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`doc_emp`, `nom_emp`, `tel_emp`, `dir_emp`) VALUES
('1022876778', 'Julio bernal', '7777777', 'calle33 # 44-1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mercancia`
--

CREATE TABLE `mercancia` (
  `cod_prod` varchar(10) NOT NULL,
  `nom_prod` varchar(20) DEFAULT NULL,
  `desc_prod` varchar(100) DEFAULT NULL,
  `cant_produ` varchar(100) DEFAULT NULL,
  `valor_unt` float DEFAULT NULL,
  `valor_tot` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mercancia`
--

INSERT INTO `mercancia` (`cod_prod`, `nom_prod`, `desc_prod`, `cant_produ`, `valor_unt`, `valor_tot`) VALUES
('40', 'arroz', 'marca diana de 500gr', '10', 1500, 150);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cli`);

--
-- Indices de la tabla `cor_despac`
--
ALTER TABLE `cor_despac`
  ADD PRIMARY KEY (`id_cord`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`doc_emp`);

--
-- Indices de la tabla `mercancia`
--
ALTER TABLE `mercancia`
  ADD PRIMARY KEY (`cod_prod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
