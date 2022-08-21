import java.util.ArrayList;

public class Obra {
    public ArrayList<Integer> clases(ArrayList<Integer> lista) {

        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        for (Integer y : lista) {
            if (!lista2.contains(y)) {
                lista2.add(y);
            }
        }System.out.println(lista2);
        return lista2;
    }

    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> list1, ArrayList<Integer> list2, int categoria) {

        ArrayList<Integer> resultado = new ArrayList<>();
        for (Integer y : list1) {
            if (list2.get(y) == categoria) {
                resultado.add(y);
            }
        }System.out.println(resultado);
        return resultado;
    }


    public ArrayList<Integer> noTengo(ArrayList<Integer> lista1,ArrayList<Integer> lista2){

        ArrayList<Integer> resultado = new ArrayList<Integer>();

        for (Integer y: lista1) {
            if(!lista2.contains(y)){
                resultado.add(y);
            }
        }System.out.println(resultado);
        return resultado;
    }


    public Integer puedoCambiar(ArrayList<Integer> list1,ArrayList<Integer> list2){

        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> resultado2 = new ArrayList<Integer>();

        for (Integer y: list1) {
            if (!list2.contains(y)){
                resultado.add(y);
            }
        }

        for (Integer x:list2) {
            if (!list1.contains(x)){
                resultado2.add(x);
            }
        }

        if(resultado.toArray().length > resultado2.toArray().length){
            return resultado2.toArray().length;
        }
        else{
            return resultado.toArray().length;
        }

    }
}


