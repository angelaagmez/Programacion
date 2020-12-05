package com.abg;

// Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar
// de la siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté
// llena, e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T3_10 {
    public static void main(String[] args) {
        int[] a = new int[10];

        System.out.println(rellenaPares(a));
    }

    public static int rellenaPares(int[] a) {
        Scanner sc = new Scanner(System.in);

        int datos, contador;

        datos = 0;
        contador = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce los datos de la tabla");
            datos = sc.nextInt();

            if (datos%2==0) {
                a[i] = datos;
            } else {
                i--;
                contador++;
            }

        }

        System.out.println(Arrays.toString(a));

        return contador;
    }


}
