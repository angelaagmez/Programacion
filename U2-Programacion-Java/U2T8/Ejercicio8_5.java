package com.abg;

// Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación, solicitará
// por teclado un valor que debe estar dentro del rango. Si no es asi, volverá a solicitar un número, y así
// repetidas veces hasta que el valor esté dentro del rango.

import java.util.Scanner;

public class Ejercicio8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max,num,aux;

        System.out.println("Introduce el minimo");
        min = sc.nextInt();

        System.out.println("Introduce el maximo");
        max = sc.nextInt();

        if (max<min) {
            aux = min;
            min = max;
            max = aux;
        }

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        while (num>max || num<min) {
            System.out.println("Introduce el numero");
            num = sc.nextInt();
        }

        /*
        while (!(num<=max && num>=min)) {
            System.out.println("Introduce el numero");
            num = sc.nextInt();
        }
         */

    }
}
