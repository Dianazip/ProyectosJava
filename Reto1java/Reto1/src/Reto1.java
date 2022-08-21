import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la distancia de la casa de Goku");
        int distanceHome = sc.nextInt();

        int distanceSphere = (distanceHome * 2) + 4;
        int travelTime = (distanceHome + distanceSphere) / 5;

        String sphereName = "";

        if (travelTime >= 0 && travelTime<= 20){
            sphereName = "uno";
        }
        else if (travelTime >= 21 && travelTime <= 30){
            sphereName = "dos";
        }
        else if (travelTime >=31 && travelTime <=50){
            sphereName = "tres";
        }
        else if (travelTime > 50){
            sphereName = "cuatro";
        }
        else if(travelTime < 0){
            System.out.println("Valor ingresado incorrecto");
        }
        System.out.println(distanceHome + " " + distanceSphere + " " + travelTime);
        System.out.println(sphereName);
    }
}
