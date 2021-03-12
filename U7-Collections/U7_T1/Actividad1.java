package U7_T1;

// Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden en que se vayan
// generando; mostrar por pantalla dicha lista una vez creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.

import java.util.ArrayList;
import java.util.LinkedList;

public class Actividad1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add((int)(Math.random()*100));
        }

        System.out.println(numeros.toString());

        numeros.sort((o1, o2) -> o1-o2);

        System.out.println(numeros.toString());

        /*
        Es lo mismo que arriba pero es mas eficiente.

        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random()*101));
        }
        lista.sort(new Comparator<Integer>(){     -     Es lo mismo que lista.sort((o1, o2) -> o1-o2);
            @Override
            public int compare(Integer o1, Integer o2){
                return o1-o2;
            }
        });
        System.out.println(lista);

        */

    }
}
