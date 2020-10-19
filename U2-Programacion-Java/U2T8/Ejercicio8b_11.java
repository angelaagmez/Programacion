package com.abg;

// Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar
// que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

import java.util.Scanner;

public class Ejercicio8b_11 {
    public static void main(String[] args) {
        int f,c,altura;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        } while (altura<3 || altura%2==0);

        for ( f = 0; f < altura ; f++) {
            for ( c = 0; c < altura ; c++) {
                if (f==c || f+c==altura-1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");

        }
    }
}
