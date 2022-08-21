CREATE TABLE IF NOT EXISTS `Intencion_Compra` (
  `Alias_cliente` VARCHAR(8) NOT NULL,
  `Fabricante_producto` VARCHAR(45) NOT NULL,
  `Fecha_consula` TIMESTAMP NOT NULL,
  CONSTRAINT `fk_cliente_consulta`
    FOREIGN KEY (`Alias_cliente`)
    REFERENCES `Clientes` (`Alias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fabricante_consulta`
    FOREIGN KEY (`Fabricante_producto`)
    REFERENCES `Productos` (`Nombre_fabricante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('lucky', 'Cannondale', '2017-10-25 20:00:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('lucky', 'Trek', '2019-03-15 18:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('lucky', 'Starker', '2019-05-20 20:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('malopez', 'Cannondale', '2018-05-20 20:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('malopez', 'Starker', '2020-01-20 20:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('diva', 'Yeti', '2019-05-20 20:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('diva', 'Fuji', '2018-06-22 21:30:00');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('diva', 'Lucky Lion', '2020-03-17 15:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('dreamer', 'Lucky Lion', '2020-03-17 15:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('dreamer', 'Be Electric', '2020-04-10 18:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('ninja', 'Aima', '2020-02-17 20:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('ninja', 'Starker', '2020-02-20 16:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('ninja', 'Mec de colombia', '2020-03-27 18:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('rose', 'Atom Electric', '2020-03-20 21:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('green', 'Yeti', '2020-01-10 17:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('green', 'Trek', '2020-02-15 20:30:20');
INSERT INTO `Intencion_Compra` (`Alias_cliente`, `Fabricante_producto`, `Fecha_consula`) VALUES ('green', 'Bmc', '2020-03-17 18:30:20');
