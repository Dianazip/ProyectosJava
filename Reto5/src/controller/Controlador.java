package controller;

import model.*;
import view.VistaConsola;

import java.sql.Timestamp;
import java.util.List;

public class Controlador {

    private VistaConsola vista;

    public Controlador(){
        vista = new VistaConsola();
        Funcionar ();
    }

    public void Funcionar (){
        int opciones_menu = 20;
        while (opciones_menu !=0){
            System.out.println("***************\n"
                    + "****EcoDosRuedas Ltda******\n"
                    + "***************\n"
                    + "*******MENU********\n"
                    + "****INGRESAR DATOS*******\n"
                    + "* 1 - Ingresar datos Clientes*****\n"
                    + "* 2 - Ingresar datos Proveedores ***\n"
                    + "* 3 - Ingresar datos intencion de compra  **\n"
                    + "* 4 - Ingresar datos producto ******\n"
                    + "******ACTUALIZAR********\n"
                    + "** 5 - Modificar telefono cliente ****\n"
                    + "** 6 - Modificar año Bicicleta ***\n"
                    + "***************\n"
                    + "*******BORRAR********\n"
                    + "** 7 - Borrar intencion de compra ***\n"
                    + "***************\n"
                    + "******CONSULTAS******\n"
                    + "** 8 - Listado fabricantes B y M ****\n"
                    + "* 9 - Listado bicicletas > 2019 ****\n"
                    + "* 10 - Listado fabricante Auteco ****\n"
                    + "* 11 - Listado B y M por cliente luky ***\n"
                    + "* 12 - Listado clientes intencion yeti **\n"
                    + "* 13 - cuantas bicicletas fabricadas > 2019 *\n"
                    + "***************\n"
                    + "******Salir otro numero 0 *****\n"
            );

            switch (opciones_menu){
                case 1:
                    System.out.println("INGRESO CLIENTES");
                    ClientesDAOImplements insertarclientes = new ClientesDAOImplements();
                    Clientes cliente = new Clientes();
                    cliente.setAlias(vista.LeerDato("Ingrese El Alias"));
                    cliente.setNombres(vista.LeerDato("Ingrese El nombre"));
                    cliente.setApellidos(vista.LeerDato("ingrese Los Apellidos"));
                    cliente.setEmail(vista.LeerDato("Ingrese El Email"));
                    cliente.setCelular(Long.parseLong(vista.LeerDato("Ingrese el numero de celular")));
                    cliente.setContraseña(vista.LeerDato("Ingrese la contraseña"));
                    cliente.setFechaNacimiento(Timestamp.valueOf(vista.LeerDato("Ingrese la Fecha de nacimiento. Formato:2008-12-31 00:00:00")));
                    insertarclientes.insertar(cliente);
                    break;

                case 2:
                    System.out.println("INGRESO PROVEEDORES");
                    ProveedoresDAOImplements insertarProveedores = new ProveedoresDAOImplements();
                    Proveedores proveedor = new Proveedores();
                    proveedor.setIdProveedores(Integer.parseInt(vista.LeerDato("Ingrese El Id Del Proveedor ")));
                    proveedor.setNombre(vista.LeerDato("ingrese el Nombre del proveedor"));
                    proveedor.setDireccion(vista.LeerDato("Ingrese La Direccion Del Proveedor"));
                    proveedor.setTelefono(Long.parseLong(vista.LeerDato("Ingrese El Telefono Del Proveedor")));
                    insertarProveedores.insertar(proveedor);
                    break;

                case 3:
                    System.out.println("INGRESO INTENCION DE COMPRA");
                    IntencionCompraDAOImplements insertarIntencionCompra = new IntencionCompraDAOImplements();
                    IntencionCompra intencion = new IntencionCompra();
                    intencion.setAlias(vista.LeerDato("ingrese el Alias"));
                    intencion.setFabricanteProducto(vista.LeerDato("Ingrese Fabricante Producto"));
                    intencion.setFechaConsulta(Timestamp.valueOf(vista.LeerDato("Ingrese la Fecha de nacimiento. Formato:2008-12-31 00:00:00")));
                    insertarIntencionCompra.insertar(intencion);
                    break;

                case 4:
                    System.out.println("INGRESE PRODUCTO");
                    ProductoDAOImplements insertaProducto = new ProductoDAOImplements();
                    Producto produc = new Producto();
                    produc.setNombre(vista.LeerDato("ingrese el nombre"));
                    produc.setTipoProducto(vista.LeerDato("ingrese el tipo de producto"));
                    produc.setPrecioUnitario(Integer.parseInt(vista.LeerDato("Ingrese el Precio Unitario")));

                    if (produc.getTipoProducto().equals("bicicleta")){
                        produc.setAutonomiaBateria(null);
                        produc.setProveedorMotor(null);
                        produc.setAñoConstruccion(Integer.parseInt(vista.LeerDato("ingrese el año de construccion")));
                    }else {
                        produc.setAutonomiaBateria(vista.LeerDato("ingrese la Autonomia de la bateria"));
                        produc.setProveedorMotor(vista.LeerDato("ingrese el proveedor motor"));
                    }
                    insertaProducto.insertar(produc);
                    break;

                case 5:
                    System.out.println("ACTUALIZAR CLIENTE");
                    ClientesDAOImplements actualizarCliente = new ClientesDAOImplements();
                    Clientes acCliente = new Clientes();
                    acCliente.setAlias(vista.LeerDato("Ingrese el alias que se modificara"));
                    acCliente.setCelular(Long.parseLong(vista.LeerDato("Ingrese el numero de celular a modificar")));
                    actualizarCliente.actualizar(acCliente);
                    break;

                case 6:
                    System.out.println("MODIFICAR AÑO BICICLETA");
                    ProductoDAOImplements actualizarProducto = new ProductoDAOImplements();
                    Producto acProducto = new Producto();
                    acProducto.setNombre(vista.LeerDato("Ingrese el Nombre del fabricante a modificar"));
                    acProducto.setAñoConstruccion(Integer.parseInt(vista.LeerDato("Ingrese el Año de Construccion nuevo")));
                    actualizarProducto.actualizar(acProducto);
                    break;

                case 7:
                    System.out.println("BORRAR INTENCION DE COMPRA");
                    IntencionCompraDAOImplements eliminarIntencionCompra = new IntencionCompraDAOImplements();
                    IntencionCompra borrar = new IntencionCompra();
                    borrar.setAlias(vista.LeerDato("Ingrese el Alias a elminar"));
                    borrar.setFabricanteProducto(vista.LeerDato("Ingrese el fabricante producto"));
                    eliminarIntencionCompra.eliminar(borrar);
                    break;

                case 8:
                    System.out.println("Listado fabricantes B y M");
                    ProductoDAOImplements listarFabricantes = new ProductoDAOImplements();
                    List<String> consulta1 = listarFabricantes.listar5();
                    System.out.println(consulta1);
                    break;

                case 9:
                    System.out.println("Listado bicicletas > 2019");
                    ProductoDAOImplements listarBicicletas = new ProductoDAOImplements();
                    List<String> consulta2 = listarBicicletas.listar2();
                    for (String objeto:consulta2) {
                        System.out.println(objeto);
                    }
                    //System.out.println(consulta2);
                    break;

                case 10:
                    System.out.println("Listado fabricante Auteco");
                    ProductoDAOImplements listarAuteco = new ProductoDAOImplements();
                    List<String> consulta3 = listarAuteco.listar3();
                    System.out.println(consulta3);
                    break;

                case 11:
                    System.out.println("Listado B y M por cliente luky");
                    IntencionCompraDAOImplements listarLucky = new IntencionCompraDAOImplements();
                    List<String> consulta4 = listarLucky.listar();
                    System.out.println(consulta4);
                    break;

                case 12:
                    System.out.println("Listado clientes intencion yeti");
                    ClientesDAOImplements listaryeti = new ClientesDAOImplements();
                    List<String> consulta5 = listaryeti.listar5();
                    for (String objeto:consulta5) {
                        System.out.println(objeto);
                    }
                    //System.out.println(consulta5);
                    break;

                case 13:
                    System.out.println("cuantas bicicletas fabricadas ");
                    ProductoDAOImplements cuantasBici = new ProductoDAOImplements();
                    List<Integer> consulta6 = cuantasBici.listar4();
                    System.out.println(consulta6);
                    break;

            }

            opciones_menu = Integer.parseInt(vista.LeerDato("Ingrese la opcion"));
        }



    }

}
