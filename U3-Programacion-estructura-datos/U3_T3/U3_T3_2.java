package com.abg;

// Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación, se introducirá
// por teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso al introducido.

import java.util.Scanner;

public class U3_T3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        int[] numeros;

        System.out.println("Introduce el tamaño del array");
        tam = sc.nextInt();

        numeros = new int[tam];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero");
            numeros[i] = sc.nextInt();
        }

        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.print(numeros[i]);
        }

    }
}
