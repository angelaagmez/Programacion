package com.abg;

// Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.


public class Ejercicio7_1 {
    public static void main(String[] args) {

        int a,b,aux;

        a = 5;
        b = 10;

        aux = a;
        a = b;
        b = aux;

        System.out.println("El valor de a es "+a);
        System.out.println("El valor de b es "+b);

    }
}
