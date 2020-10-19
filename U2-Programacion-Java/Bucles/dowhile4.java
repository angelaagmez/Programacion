package com.abg;

// Crea un programa que pida al usuario dos números enteros y muestre su suma.
// Se repetirá hasta que los dos sean 0. Emplea do-while.

import java.util.Scanner;

public class dowhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.println("Introduce un numero");
        n1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        n2 = sc.nextInt();

        do {
            System.out.println("La suma es "+(n1+n2));
            System.out.println("Introduce un numero");
            n1 = sc.nextInt();
            System.out.println("Introduce otro numero");
            n2 = sc.nextInt();

    } while (n1!=0 || n2!=0);
}
}
