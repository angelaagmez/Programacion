package com.abg;

import java.util.Arrays;
import java.util.Scanner;

public class practicar_añadir_filacolumna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] origen;
        int[][] destino;
        int tam;

        System.out.println("Introduce el tamaño");
        tam = sc.nextInt();

        origen = new int[tam][tam];
        destino = new int[tam+1][tam+1];

        for (int i = 0; i < origen.length; i++) {
            int suma = 0;
            int suma2 = 0;
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = (int)(Math.random()*11);
                destino[i][j] = origen[i][j];

                suma += origen[i][j];


            }
            destino[i][origen.length] = suma;

        }


        for (int i = 0; i < origen.length; i++) {
            System.out.println(Arrays.toString(origen[i]));
        }

        System.out.println("");

        for (int i = 0; i < destino.length; i++) {
            System.out.println(Arrays.toString(destino[i]));
        }

    }
}
