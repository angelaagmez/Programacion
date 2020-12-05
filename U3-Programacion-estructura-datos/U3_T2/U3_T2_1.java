package com.abg;

// Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas
// con espacios en blanco. Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier
// combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.

import java.util.Scanner;

public class U3_T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra,frase;

        frase = "";

        do {
            System.out.println("Introduce palabra");
            palabra = sc.nextLine();
            if (!palabra.equals("fin")) {
                frase += " " + palabra;
            }
        } while (!palabra.equals("fin"));

        System.out.println(frase+".");

    }
}
