package com.abg;

import java.util.Scanner;

// Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

public class Ejercicio5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if (num%2==0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        // System.out.println(num%2==0 ? "Es par" : "Es impar");
        // ? - sustituir
        // : - si no

        // tambien podemos darle un valor a la cadena
        // String s;
        // s = num%2==0 ? "Es par" : "Es impar";
        // System.out.println(s);

    }
}
