package U7_T1;

// Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por orden decreciente
// a medida que se vayan generando, y mostrar la colección por pantalla.

import java.util.ArrayList;
import java.util.TreeSet;

public class Actividad5 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            if (!numeros.add((int)(Math.random()*100))){
                i--;
            }
        }

        System.out.println(numeros);
    }
}
