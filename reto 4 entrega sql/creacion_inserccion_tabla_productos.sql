CREATE TABLE IF NOT EXISTS `Productos` (
  `Nombre_fabricante` VARCHAR(45) NOT NULL,
  `Tipo_producto` VARCHAR(45) NOT NULL,
  `Precio_unitario` INT NOT NULL,
  `Año_construccion` INT,
  `Autonomia_bateria` VARCHAR(45),
  `Proveedor_motor` VARCHAR(45),
  PRIMARY KEY (`Nombre_fabricante`),
  CONSTRAINT `fk_proveedor_producto`
    FOREIGN KEY (`Proveedor_motor`)
    REFERENCES `Proveedores` (`Nombre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Cannondale', 'bicicleta', 1200000, 2020, NULL, NULL);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Trek', 'bicicleta', 1450000, 2019, NULL, NULL);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Yeti', 'bicicleta', 2000000, 2020, NULL, NULL);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Fuji', 'bicicleta', 950000, 2021, NULL, NULL);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Bmc', 'bicicleta', 1950000 , 1018, NULL, NULL);
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Starker', 'motocicleta_electrica', 4200000, NULL, '18 horas', 'Auteco');
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Lucky Lion', 'motocicleta_electrica', 5600000, NULL, '14 horas', 'Hitachi');
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Be Electric', 'motocicleta_electrica', 4600000, NULL, '26 horas', 'Auteco');
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Aima', 'motocicleta_electrica', 8000000, NULL, '36 horas', 'Bosch');
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Mec de Colombia', 'motocicleta_electrica', 5900000, NULL, '20 horas', 'Teco');
INSERT INTO `Productos` (`Nombre_fabricante`, `Tipo_producto`, `Precio_unitario`, `Año_construccion`, `Autonomia_bateria`, `Proveedor_motor`) VALUES ('Atom Electric', 'motocicleta_electrica', 4500000, NULL, '12 horas', 'General Electric');