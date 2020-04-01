DROP DATABASE IF EXISTS `examenComponentes`;
CREATE DATABASE IF NOT EXISTS `examenComponentes` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `examenComponentes`;

/*Tabla de productos*/
DROP TABLE IF EXISTS `tproduct`;
CREATE TABLE IF NOT EXISTS `tproduct` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `quality` VARCHAR(1) NOT NULL,
  `warehouse` INT(1) NOT NULL,
  `amount` INT(5) NOT NULL,
  `boxes` INT(2) NOT NULL,
  `created` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Tabla de bodegas*/
DROP TABLE IF EXISTS `twarehouse`;
CREATE TABLE IF NOT EXISTS `twarehouse` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=LATIN1;

/*Insert de bodegas*/
INSERT INTO `examencomponentes`.`twarehouse` (`id`, `name`, `description`) VALUES ('1', 'Norte', 'Bodega norte');
INSERT INTO `examencomponentes`.`twarehouse` (`id`, `name`, `description`) VALUES ('2', 'Oeste', 'Bodega oeste');
INSERT INTO `examencomponentes`.`twarehouse` (`id`, `name`, `description`) VALUES ('3', 'Sur', 'Bodega sur');
INSERT INTO `examencomponentes`.`twarehouse` (`id`, `name`, `description`) VALUES ('4', 'Este', 'Bodega este');