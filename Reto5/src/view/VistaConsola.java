package view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner sc;

    public VistaConsola(){
        sc =new Scanner(System.in);
    }

    public String LeerDato(String mensaje){
        System.out.println(mensaje);
        String dato = sc.nextLine();
        return dato;
    }

    public void MostrarInformacion(String mensaje){
        System.out.println(mensaje);
    }
}
