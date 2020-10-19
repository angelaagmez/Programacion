package com.abg;

// Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado hueco de ese ancho,
// que tendrá un borde formado por asteriscos y su interior serán espacios en blanco.
// Por ejemplo, para un tamaño de 4 sería:

import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        int tam;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño");
        tam = sc.nextInt();


        for (int i = 0; i < tam; i++) {
            for (int j=0; j<tam; j++) {
                if (i==0 || i==tam-1 || j==0 || j==tam-1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
        }

        System.out.println("");
    }
}