package com.abg;

// Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla un rectángulo formado
// por asteriscos, que tendrá como alto el primer número y como ancho el segundo número.

import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        int alt, anch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la anchura");
        anch = sc.nextInt();

        System.out.println("Introduce la altura");
        alt = sc.nextInt();

        for (int i=1; i<alt; i++){
            for (int j=1; j<anch; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


    }
}
