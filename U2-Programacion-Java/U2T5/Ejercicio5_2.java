package com.abg;

import java.util.Scanner;

// Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.

public class Ejercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el numero 12");
        n = sc.nextInt();

        if (n==12){
            System.out.println("El numero es correcto");
        } else {
            System.out.println("El numero es incorrecto");
        }

    }
}
