-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 22-11-2018 a las 06:47:16
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.6.36

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `wolfs`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE IF NOT EXISTS `acceso` (
  `idAcceso` int(11) NOT NULL AUTO_INCREMENT,
  `fkUsuario` int(11) DEFAULT NULL,
  `fechaAcceso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idAcceso`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=88 ;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`idAcceso`, `fkUsuario`, `fechaAcceso`) VALUES
(31, 1, '2018-11-20 15:01:36'),
(32, 1, '2018-11-21 06:04:19'),
(33, 1, '2018-11-21 06:05:31'),
(34, 1, '2018-11-21 06:07:36'),
(35, 1, '2018-11-21 08:53:00'),
(36, 1, '2018-11-21 16:09:38'),
(37, 1, '2018-11-21 16:12:02'),
(38, 1, '2018-11-21 16:34:20'),
(39, 1, '2018-11-21 18:44:03'),
(40, 1, '2018-11-21 18:45:51'),
(41, 1, '2018-11-21 18:49:28'),
(42, 1, '2018-11-21 19:03:44'),
(43, 1, '2018-11-21 19:43:05'),
(44, 1, '2018-11-21 19:45:02'),
(45, 1, '2018-11-21 19:51:21'),
(46, 1, '2018-11-21 19:52:34'),
(47, 1, '2018-11-21 19:53:24'),
(48, 1, '2018-11-21 19:54:48'),
(49, 1, '2018-11-21 19:55:31'),
(50, 1, '2018-11-21 19:58:46'),
(51, 1, '2018-11-21 19:59:26'),
(52, 1, '2018-11-21 20:01:12'),
(53, 1, '2018-11-21 20:04:01'),
(54, 1, '2018-11-21 20:05:35'),
(55, 1, '2018-11-21 21:12:56'),
(56, 1, '2018-11-21 21:16:48'),
(57, 1, '2018-11-21 21:31:10'),
(58, 1, '2018-11-21 21:32:37'),
(59, 1, '2018-11-21 21:46:57'),
(60, 1, '2018-11-21 21:56:24'),
(61, 1, '2018-11-21 21:57:43'),
(62, 1, '2018-11-21 22:00:33'),
(63, 1, '2018-11-21 22:01:34'),
(64, 1, '2018-11-21 22:06:21'),
(65, 1, '2018-11-21 22:45:33'),
(66, 1, '2018-11-21 22:49:02'),
(67, 1, '2018-11-21 22:53:52'),
(68, 1, '2018-11-21 22:57:17'),
(69, 1, '2018-11-21 23:01:46'),
(70, 1, '2018-11-22 00:17:58'),
(71, 1, '2018-11-22 00:32:52'),
(72, 1, '2018-11-22 00:35:03'),
(73, 1, '2018-11-22 00:36:49'),
(74, 1, '2018-11-22 00:42:19'),
(75, 1, '2018-11-22 00:42:42'),
(76, 1, '2018-11-22 00:43:56'),
(77, 1, '2018-11-22 00:44:23'),
(78, 1, '2018-11-22 00:45:02'),
(79, 1, '2018-11-22 01:00:17'),
(80, 1, '2018-11-22 01:00:34'),
(81, 1, '2018-11-22 01:03:31'),
(82, 1, '2018-11-22 01:20:04'),
(83, 8, '2018-11-22 01:55:47'),
(84, 1, '2018-11-22 02:15:07'),
(85, 10, '2018-11-22 04:12:48'),
(86, 13, '2018-11-22 04:24:38'),
(87, 15, '2018-11-22 04:32:54');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `archivos`
--

CREATE TABLE IF NOT EXISTS `archivos` (
  `idArchivo` int(10) NOT NULL AUTO_INCREMENT,
  `nombreArchivo` varchar(50) NOT NULL,
  `fechaCreacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idArchivo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `archivos`
--

INSERT INTO `archivos` (`idArchivo`, `nombreArchivo`, `fechaCreacion`) VALUES
(1, 'C:\\Users\\Diana\\Documents\\diana.txt', '2018-11-21 16:36:45'),
(2, 'C:\\Users\\Diana\\Documents\\jUAN.txt', '2018-11-22 01:21:12'),
(3, 'C:\\Users\\Diana\\Documents\\hola.txt', '2018-11-22 01:57:41'),
(4, 'C:\\Users\\Diana\\Documents\\hola.txt', '2018-11-22 04:26:22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE IF NOT EXISTS `evento` (
  `idEvento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombreEvento` varchar(50) DEFAULT NULL,
  `descripcion` text,
  `statusEvento` enum('Activo','Inactivo') DEFAULT 'Activo',
  `fechaEvento` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fkUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEvento`),
  UNIQUE KEY `idEvento` (`idEvento`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`idEvento`, `nombreEvento`, `descripcion`, `statusEvento`, `fechaEvento`, `fkUsuario`) VALUES
(1, 'djdd', 'sjsdncnxsbd', 'Inactivo', '2018-11-21 19:47:43', NULL),
(2, 'ejdbdd', 'ndn ncbdbc xlmclnm ', 'Activo', '2018-11-09 00:15:23', NULL),
(3, 'Cumpleaños Diana', 'hola', 'Inactivo', '2018-11-21 19:59:08', 1),
(4, 'Holaaas', 'cnjdbhbc', 'Activo', '2018-11-11 00:18:59', 2),
(5, 'djjdbbc', 'sbjcxb\ndjnsn\ncjbdjs', 'Activo', '2018-11-11 00:22:37', 1),
(6, 'Diana cumpleaños', 'Este seera el cumpleaños de diana', 'Activo', '2018-11-09 16:56:47', 1),
(7, 'solooo', 'Holaaa', 'Activo', '2018-11-09 17:04:53', 2),
(8, 'Diana cumpleaños', 'dksnsnx s', 'Activo', '2018-11-01 17:09:52', 2),
(9, 'Diana98', 'sjsjxjbd', 'Activo', '2018-11-10 17:29:31', 1),
(10, 'sjjdb', 'jsxjs', 'Activo', '2018-11-16 17:45:43', 2),
(11, 'Dianaa', 'Fiesta', 'Activo', '2018-11-17 16:09:49', 1),
(12, 'Diana', 'sbjcxb\ndjnsn\ncjbdjs', 'Activo', '2018-11-09 21:13:14', 1),
(13, 'Hola', 'sbjcxb\ndjnsn\ncjbdjs', 'Activo', '2018-11-09 21:16:58', 1),
(14, 'Cumpleaños Diana', 'hola este sera ,mi cumpleaños', 'Activo', '2018-11-25 02:00:20', 8),
(15, 'Cumpleaños diana', 'Cumpleaños en casa dediana', 'Activo', '2018-11-20 17:00:00', 13),
(16, 'Cumpleaños diana', 'SJDHDDJXMND', 'Activo', '2018-11-09 04:36:07', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fichero`
--

CREATE TABLE IF NOT EXISTS `fichero` (
  `idFichero` int(11) NOT NULL AUTO_INCREMENT,
  `nombreFichero` varchar(90) DEFAULT NULL,
  `ficheroCreacionFichero` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fkFichero` int(11) DEFAULT NULL,
  `fkUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idFichero`),
  KEY `fkFichero` (`fkFichero`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `fichero`
--

INSERT INTO `fichero` (`idFichero`, `nombreFichero`, `ficheroCreacionFichero`, `fkFichero`, `fkUsuario`) VALUES
(1, 'dhs', '2018-11-17 16:23:23', NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fondo`
--

CREATE TABLE IF NOT EXISTS `fondo` (
  `idFondo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `imagen` varchar(100) DEFAULT NULL,
  `statusFondo` enum('Activo','Inactivo') NOT NULL DEFAULT 'Activo',
  `fechaFondo` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `fkUsuario` int(11) DEFAULT NULL,
  `tituloImagen` varchar(20) NOT NULL,
  PRIMARY KEY (`idFondo`),
  UNIQUE KEY `idFondo` (`idFondo`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `fondo`
--

INSERT INTO `fondo` (`idFondo`, `imagen`, `statusFondo`, `fechaFondo`, `fkUsuario`, `tituloImagen`) VALUES
(1, 'D:\\WolfSystem\\Wolf system\\src\\img\\s.jpg', 'Activo', '2018-11-22 03:50:26', NULL, 'hola'),
(2, 'D:\\WolfSystem\\Wolf system\\src\\img\\fondo1.png', 'Activo', '2018-11-22 03:57:54', NULL, 'd'),
(3, 'D:\\WolfSystem\\Wolf system\\src\\img\\Concept_artwork_1_Battle_of_Hogwarts.jpg', 'Activo', '2018-11-22 03:58:59', NULL, 'bu');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE IF NOT EXISTS `historial` (
  `idHistorial` int(11) NOT NULL AUTO_INCREMENT,
  `URL` varchar(90) DEFAULT NULL,
  `fechaHistorial` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `statusHistorial` enum('Activo','Inactivo') DEFAULT 'Activo',
  `fkUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idHistorial`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`idHistorial`, `URL`, `fechaHistorial`, `statusHistorial`, `fkUsuario`) VALUES
(1, '', '2018-11-22 00:37:07', 'Activo', 1),
(2, 'www.facebook.com', '2018-11-22 00:45:21', 'Activo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `musica`
--

CREATE TABLE IF NOT EXISTS `musica` (
  `idMusica` int(11) NOT NULL AUTO_INCREMENT,
  `URL` varchar(100) NOT NULL,
  `fkPlaylist` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMusica`),
  KEY `fkPlaylist` (`fkPlaylist`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `playlist`
--

CREATE TABLE IF NOT EXISTS `playlist` (
  `idPlaylist` int(11) NOT NULL AUTO_INCREMENT,
  `tituloPlaylist` varchar(50) NOT NULL,
  `fechaDeCreacionPlaylist` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `statusPlaylist` enum('Activo','Inactivo') DEFAULT 'Activo',
  `fkUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPlaylist`),
  KEY `fkUsuario` (`fkUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `playlist`
--

INSERT INTO `playlist` (`idPlaylist`, `tituloPlaylist`, `fechaDeCreacionPlaylist`, `statusPlaylist`, `fkUsuario`) VALUES
(1, 'Hola', '2018-11-21 08:53:14', 'Activo', 1),
(2, 'HOLA', '2018-11-21 22:46:03', 'Activo', 1),
(3, 'hola', '2018-11-21 22:49:13', 'Activo', 1),
(4, 'ADD', '2018-11-21 22:54:31', 'Activo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(90) NOT NULL,
  `username` varchar(30) NOT NULL,
  `statusUsuario` enum('Activo','Inactivo') NOT NULL DEFAULT 'Activo',
  `tipoUsuario` enum('Admin','Invitado') NOT NULL DEFAULT 'Admin',
  `password` varchar(8) NOT NULL,
  `UltimaModUsuario` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `username`, `statusUsuario`, `tipoUsuario`, `password`, `UltimaModUsuario`) VALUES
(1, 'Diana Laura de la Vega Sierra', 'Diana98', 'Activo', 'Admin', '12345', '2018-11-20 02:50:32'),
(2, 'Laura Hernandez', 'Lau1', 'Inactivo', 'Invitado', '1234', '2018-11-20 02:51:09'),
(3, 'Luz Sierra', 'Luz12', 'Inactivo', 'Invitado', '1234', '2018-11-22 04:17:29'),
(4, 'Luz Maria de la Vega', 'Luz2000', 'Inactivo', 'Invitado', '1234', '2018-11-22 04:17:48'),
(5, 'Laura de la vega', 'Dai98', 'Activo', 'Admin', '12345', '2018-11-22 01:03:01'),
(6, 'judhs', 'ddk', 'Activo', 'Admin', '12345', '2018-11-22 01:19:50'),
(7, 'Juana', 'Hernandez', 'Inactivo', 'Invitado', '12345', '2018-11-22 04:18:11'),
(8, 'Diana Laura de la Vega Sierra', 'Diana100', 'Activo', 'Admin', '1234', '2018-11-22 01:55:36'),
(9, 'Luci germ', 'luz981', 'Activo', 'Invitado', '1234', '2018-11-22 01:56:26'),
(10, 'Diana Laura de la Vega', 'Diana98', 'Activo', 'Admin', '12345', '2018-11-22 04:12:28'),
(11, 'Luz Maria Hernandez', 'Luz200', 'Activo', 'Invitado', '1234', '2018-11-22 04:13:24'),
(12, 'Diana Laura de la Vega', 'Diana98', 'Activo', 'Admin', '1234', '2018-11-22 04:22:10'),
(13, 'Diana Laura de la Vega', 'Diana98', 'Activo', 'Admin', '12345', '2018-11-22 04:24:15'),
(14, 'Laura Hernandez', 'Lau98', 'Activo', 'Invitado', '12345', '2018-11-22 04:25:14'),
(15, 'Diana Laura de la Vega', 'Diana98', 'Activo', 'Admin', '12345', '2018-11-22 04:32:39'),
(16, 'Laura Hernandez', 'Lau18', 'Activo', 'Invitado', '12345', '2018-11-22 04:33:26');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `acceso`
--
ALTER TABLE `acceso`
  ADD CONSTRAINT `acceso_ibfk_1` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `fichero`
--
ALTER TABLE `fichero`
  ADD CONSTRAINT `fichero_ibfk_1` FOREIGN KEY (`fkFichero`) REFERENCES `fichero` (`idFichero`),
  ADD CONSTRAINT `fichero_ibfk_2` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `fondo`
--
ALTER TABLE `fondo`
  ADD CONSTRAINT `fondo_ibfk_1` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `musica`
--
ALTER TABLE `musica`
  ADD CONSTRAINT `musica_ibfk_1` FOREIGN KEY (`fkPlaylist`) REFERENCES `playlist` (`idPlaylist`);

--
-- Filtros para la tabla `playlist`
--
ALTER TABLE `playlist`
  ADD CONSTRAINT `playlist_ibfk_1` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`idUsuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
