package U7_T2;

// Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista, fusión de las
// dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir, que las listas utilizadas como
// parámetros de entrada se mantengan intactas.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Actividad13 {
    public static void main(String[] args) {
        List lista1 = new ArrayList<String>();
        List lista2 = new ArrayList<String>();

        lista1.add("HOLA");
        lista1.add("QUE TAL");
        lista1.add("ADIOS");
        lista1.add("SALUDOS");

        lista2.add("QUE PASA");
        lista2.add("YO");
        lista2.add("BIEN");
        lista2.add("Y TU");

        lista1.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareToIgnoreCase((String)o2);
            }
        });

        lista2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println("Lista 1: "+lista1);
        System.out.println("Lista 2: "+lista2);
        System.out.println("Fusion listas: "+fusion(lista1,lista2));
    }

    public static List fusion(List l1, List l2){
        List resultado = new ArrayList<String>();
        resultado.addAll(l1);
        resultado.addAll(l2);
        resultado.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        return resultado;
    }

}
