package com.abg;

// Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera, de forma
// que los 12 números sigan ordenados. Fusionar significa copiar en el orden correcto para que los datos
// resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[6];
        int[] num2 = new int[6];
        int[] union = new int[num1.length+num2.length];


        for (int i = 0; i < num1.length; i++) {
            System.out.println("Introduce los numeros del array 1 (posicion "+i+" )");
            num1[i] = sc.nextInt();
            System.out.println("Introduce los numeros del array 2 (posicion "+i+" )");
            num2[i] = sc.nextInt();
        }

        Arrays.sort(num1);
        Arrays.sort(num2);

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        for (int i = 0; i < num1.length; i++) {
            union[i] = num1[i];
            union[i+num1.length] = num2[i];
        }

        Arrays.sort(union);
        System.out.println(Arrays.toString(union));

    }
}
