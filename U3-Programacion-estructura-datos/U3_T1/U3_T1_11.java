package com.abg;

// Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
// Realizar una versión iterativa y otra recursiva.

public class U3_T1_11 {
    public static void main(String[] args) {
        System.out.println(potencia(2,3));
    }

    public static int potencia(int a, int n) {
        int cont;
        cont = a;

        if (n>0) {
            for (int i = 1; i < n; i++) {
               cont = cont * a;
            }
        }
        return cont;
    }

}
