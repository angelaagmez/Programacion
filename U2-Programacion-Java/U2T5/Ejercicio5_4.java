package com.abg;

import java.util.Scanner;

// Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

public class Ejercicio5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,numpares;

        numpares = 0;

        System.out.println("Introduce un numero");
        n1 = sc.nextInt();

        System.out.println("Introduce otro numero");
        n2 = sc.nextInt();

        if (n1%2==0){
            numpares++;
        }
        if (n2%2==0){
            numpares++;
        }

        System.out.println("Hay "+numpares+" numeros pares");

    }
}
