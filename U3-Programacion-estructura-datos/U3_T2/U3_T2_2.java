package com.abg;

// Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

import java.util.Scanner;

public class U3_T2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int contador;

        contador = 0;

        System.out.println("Introduce una frase");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') {
                contador++;
            }
        }

        System.out.println("Hay "+contador+" espacios");

    }
}
