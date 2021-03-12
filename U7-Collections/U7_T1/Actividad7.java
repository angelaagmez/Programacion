package U7_T1;

// Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por orden alfabético
// en una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        TreeSet<String> palabras = new TreeSet<>();

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
