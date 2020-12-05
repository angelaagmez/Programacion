package com.abg;

// Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil
// que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
// cuenta con64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
//Introduzca la posición del alfil: d5
//El alfil puede moverse a las siguientes posiciones:h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] num = new String[8][8];
        int fila,colum;

        do{
            System.out.println("Introduce la posicion del alfil (fila)");
            fila = sc.nextInt();
            System.out.println("Introduce la posicion del alfil (columna)");
            colum = sc.nextInt();
        } while (fila>7 || colum>7 || fila<0 || colum<0);



        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (i+j==fila+colum || i-j==fila-colum) {
                    num[i][j] = "X";
                } else {
                    num[i][j] = "-";
                }
            }
        }

        num[fila][colum] = "A";

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }



    }
}
