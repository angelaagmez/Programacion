package com.abg;

// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.

import java.util.Scanner;

public class Ejercicio8_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean primo;

        System.out.println("Introduce el numero");
        n = sc.nextInt();

        for (int i = 1; i < n ; i++) {
            primo = true;
            for (int j = 2; j < i ; j++) {
                if (i%j==0) {
                    primo = false;
                    break;
                }
            }

            System.out.println(i+((primo) ? " es primo" : " no es primo"));

            /*
            if (primo) {
                System.out.println(i+" es primo");
            } else {
                System.out.println(i+" no es primo");
            }
             */

        }

    }
}
