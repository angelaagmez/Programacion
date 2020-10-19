package com.abg;

// Crea un programa que pida al usuario un número entero largo y muestre cuáles son sus divisores (aquellos entre los
// que se puede dividir, obteniendo como resto 0).

import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        System.out.println("Introduce un numero");
        num = sc.nextLong();

        for (int i=1; i<=num; i++) {
            if (num%1==0) {
                System.out.println("Division: "+i+"\t");
            }
        }

    }
}
