package U5.libro;

import java.util.Arrays;
import java.util.Comparator;

public class Ej_91 {
    public static void main(String[] args) {
        Integer[] tabla = new Integer[20];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*101);
        }

        System.out.println("Orden ascendente");
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));

        System.out.println("Orden descendente");
        Arrays.sort(tabla, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(tabla));
    }

}
