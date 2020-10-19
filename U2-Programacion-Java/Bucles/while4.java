package com.abg;

// Crea un programa que pida al usuario un número entero y
// muestre su cuadrado. Se repetirá mientras el usuario introduzca un número
// distinto de cero.

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero");
        n = sc.nextInt();

        while (n!=0) {
            System.out.println("El cuadrado es "+(n*n));
            System.out.println("Introduce un numero");
            n = sc.nextInt();
        }
    }
}
