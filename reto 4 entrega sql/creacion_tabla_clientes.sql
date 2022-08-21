CREATE TABLE IF NOT EXISTS `mydb`.`Clientes` (
  `Alias` VARCHAR(8) NOT NULL,
  `Nombres` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Celular` BIGINT(10) NOT NULL,
  `Contraseña` VARCHAR(45) NOT NULL,
  `Fecha_nacimiento` TIMESTAMP NOT NULL,
  PRIMARY KEY (`Alias`))
ENGINE = InnoDB
