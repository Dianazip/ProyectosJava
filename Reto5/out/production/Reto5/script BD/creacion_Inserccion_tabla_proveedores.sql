CREATE TABLE IF NOT EXISTS `Proveedores` (
  `idProveedores` INT NOT NULL,
  `Nombre` VARCHAR(20) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`Nombre`));
INSERT INTO `Proveedores` (`idProveedores`, `Nombre`, `Direccion`, `telefono`) VALUES (101, 'Auteco', 'calle 7 No. 45-17', '05713224459');
INSERT INTO `Proveedores` (`idProveedores`, `Nombre`, `Direccion`, `telefono`) VALUES (102, 'Hitachi', 'calle 19 No. 108-26', '05714223344');
INSERT INTO `Proveedores` (`idProveedores`, `Nombre`, `Direccion`, `telefono`) VALUES (103, 'Bosch', 'carrera 68 No. 26-45', '05715678798');
INSERT INTO `Proveedores` (`idProveedores`, `Nombre`, `Direccion`, `telefono`) VALUES (104, 'Teco', 'calle 77 No. 68-33', '05712213243');
INSERT INTO `Proveedores` (`idProveedores`, `Nombre`, `Direccion`, `telefono`) VALUES (105, 'General Electric', 'calle 29 No. 26-12', '05717239919');