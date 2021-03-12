package U7_T1;

// Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos
// (sin modificar la original), con el prototipo:
//
//List eliminaRepetidos (List c)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Actividad8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Pepe");
        nombres.add("Marcos");
        nombres.add("Pepe");
        nombres.add("Pepe");
        nombres.add("Pepe");
        nombres.add("Lola");
        nombres.add("Rosa");
        nombres.add("Sergio");

        System.out.println(eliminaRepetidos(nombres));
    }

    public static List eliminaRepetidos(List c){
        ArrayList<String> lista = new ArrayList<>();
        for (String nombre: (List<String>) c) {
            if (!lista.contains(nombre)){
                lista.add(nombre);
            }
        }
        return lista;



        /* Lo mismo pasando de conjunto a lista

        HashSet<String> conjunto = new HashSet<>();

        conjunto.addAll((List<String>) c);

        ArrayList<String> resultado = new ArrayList<>();

        return resultado.addAll(conjunto);

        return resultado;
        */
    }
}
