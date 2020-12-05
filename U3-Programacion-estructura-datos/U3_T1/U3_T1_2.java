package com.abg;

// Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

public class U3_T1_2 {
    public static void main(String[] args) {
        enteros(10, 20);
    }

    public static void enteros(int num1, int num2) {
        for (int i = num1+1; i < num2; i++) {
            System.out.println(i);
        }
    }

}
