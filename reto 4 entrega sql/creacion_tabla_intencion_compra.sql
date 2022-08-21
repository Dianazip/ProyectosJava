CREATE TABLE IF NOT EXISTS `mydb`.`Intencion_Compra` (
  `Alias_cliente` VARCHAR(8) NOT NULL,
  `Fabricante_producto` VARCHAR(45) NOT NULL,
  `Fecha_consula` TIMESTAMP NOT NULL,
  INDEX `fk_cliente_compra_idx` (`Alias_cliente` ASC) VISIBLE,
  INDEX `fk_fabricante_consulta_idx` (`Fabricante_producto` ASC) VISIBLE,
  CONSTRAINT `fk_cliente_consulta`
    FOREIGN KEY (`Alias_cliente`)
    REFERENCES `mydb`.`Clientes` (`Alias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fabricante_consulta`
    FOREIGN KEY (`Fabricante_producto`)
    REFERENCES `mydb`.`Productos` (`Nombre_fabricante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB