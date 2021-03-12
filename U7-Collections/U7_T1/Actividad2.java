package U7_T1;

// Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.

import java.util.ArrayList;

public class Actividad2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add((int)(Math.random()*101));
        }

        System.out.println(numeros.toString());

        numeros.sort((o1, o2) -> o2-o1);

        System.out.println(numeros.toString());
    }
}
