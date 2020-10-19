package com.abg;

import java.util.Scanner;

// Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

public class Ejercicio5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1,n2,n3;

        System.out.println("Introduce un numero");
        n1 = sc.nextLong();

        System.out.println("Introduce otro numero");
        n2 = sc.nextLong();

        System.out.println("Introduce el ultimo numero");
        n3 = sc.nextLong();

        if ((n1>n2) && (n1>n3)) {
            System.out.println("El mayor es "+n1);
        } else if ((n2>n1) && (n2>n3)) {
            System.out.println("El mayor es "+n2);
        } else {
            System.out.println("El mayor es "+n3);
        }

    }
}
