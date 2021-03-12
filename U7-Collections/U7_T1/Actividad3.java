package U7_T1;

// Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden decreciente a medida que
// se vayan generando y mostrar la colección por pantalla.

import java.util.ArrayList;

public class Actividad3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add((int)(Math.random()*10));
            numeros.sort((o1, o2) -> o2-o1);
        }

        System.out.println(numeros.toString());
    }
}
