Select 'Consulta 1';
SELECT Nombre_fabricante FROM productos ORDER BY Nombre_fabricante ASC;

Select 'Consulta 2';
SELECT Nombre_fabricante,Precio_unitario,Año_construccion FROM productos WHERE Tipo_producto = "bicicleta" AND Año_construccion >= 2019 ORDER BY Nombre_fabricante ASC;

Select 'Consulta 3';
SELECT Nombre_fabricante FROM productos WHERE Proveedor_motor = "Auteco" AND Tipo_producto = "motocicleta_electrica";

Select 'Consulta 4';
select Fabricante_producto from intencion_compra where Alias_cliente = "lucky" ORDER BY Fabricante_producto ASC ;

Select 'Consulta 5';
select c.Alias,c.Nombres,c.Apellidos from clientes c left join intencion_compra r on Alias_cliente=Alias where Fabricante_producto = "Yeti" order by c.Nombres;

select 'Consulta 6';
select count(*) from productos where Tipo_producto = "bicicleta" and Año_construccion >= 2019;