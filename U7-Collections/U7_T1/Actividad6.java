package U7_T1;

// Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección,
// de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        LinkedHashSet<String> palabras = new LinkedHashSet<>();

        do {
            System.out.println("Introduce la palabra (fin para parar)");
            palabra = sc.nextLine();

            if (!palabra.equalsIgnoreCase("fin")){
                palabras.add(palabra);
            }

        } while (!palabra.equalsIgnoreCase("fin"));


        System.out.println(palabras.toString());

    }
}
