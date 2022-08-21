CREATE TABLE IF NOT EXISTS`Clientes` (
  `Alias` VARCHAR(8) NOT NULL,
  `Nombres` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Celular` BIGINT(10) NOT NULL,
  `Contraseña` VARCHAR(45) NOT NULL,
  `Fecha_nacimiento` TIMESTAMP NOT NULL,
  PRIMARY KEY (`Alias`));
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('lucky', 'Pedro', 'Perez', 'pedro.perez@retocuatro.com', 3156298458, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('malopez', 'Maria', 'Lopez', 'maria.lopez@retocuatro.com', 3102569542, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('diva', 'Ana', 'Diaz', 'ana.diaz@retocuatro.com', 3165824694, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('dreamer', 'Luis', 'Rojas', 'luis.rojas@retocuatro.com', 3105775454, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('ninja', 'Andres', 'Cruz', 'andres.cruz@retocuatro.com', 3154284675, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('neon', 'Nelson', 'Ruiz', 'nelson.ruiz@retocuatro.com', 3172488511, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('rose', 'Claudia', 'Mendez', 'claudia.mendez@retocuatro.com', 3005846871, '1234', '2008-12-31 00:00:00');
INSERT INTO `Clientes` (`Alias`, `Nombres`, `Apellidos`, `Email`, `Celular`, `Contraseña`, `Fecha_nacimiento`) VALUES ('green', 'Jorge', 'Rodriguez', 'jorge.rodriguez@retocuatro.com', 3251754878, '1234', '2008-12-31 00:00:00');

