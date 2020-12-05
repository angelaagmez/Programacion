package com.abg;

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ajedrez_torre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] num = new String[8][8];
        int fila,colum;

        do{
            System.out.println("Introduce la posicion de la torre (fila)");
            fila = sc.nextInt();
            System.out.println("Introduce la posicion de la torre (columna)");
            colum = sc.nextInt();
        } while (fila>7 || colum>7 || fila<0 || colum<0);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (i==fila || j==colum) {
                    num[i][j] = "X";
                } else {
                    num[i][j] = "-";
                }
            }
        }

        num[fila][colum] = "T";

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }



    }
}
