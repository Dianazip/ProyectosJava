CREATE TABLE IF NOT EXISTS `mydb`.`Productos` (
  `Nombre_fabricante` VARCHAR(45) NOT NULL,
  `Tipo_producto` VARCHAR(45) NOT NULL,
  `Precio_unitario` INT NOT NULL,
  `Año_construccion` INT NOT NULL,
  `Autonomia_bateria` VARCHAR(45) NOT NULL,
  `Proveedor_motor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Nombre_fabricante`),
  INDEX `fk_proveedor_producto_idx` (`Proveedor_motor` ASC) VISIBLE,
  CONSTRAINT `fk_proveedor_producto`
    FOREIGN KEY (`Proveedor_motor`)
    REFERENCES `mydb`.`Proveedores` (`Nombre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB