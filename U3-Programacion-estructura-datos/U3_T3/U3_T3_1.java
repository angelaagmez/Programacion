package com.abg;


// Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar los números
// en el mismo orden en que se han introducido.

import java.util.Scanner;

public class U3_T3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] numeros = new Double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("La posicion "+i+" es el numero "+numeros[i]);
        }

    }
}
