package com.abg;

//  Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [n,m] debe contener n+m.
//  Después, se debe mostrar su contenido.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] b = new int[5][5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = i+j;
            }
        }

        System.out.println(Arrays.deepToString(b));

        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));   // para mostrar en columnas
        }
    }
}
