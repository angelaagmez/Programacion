package com.abg;

// Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

import java.util.Scanner;

public class Ejercicio8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.println(i);
        }

    }
}
