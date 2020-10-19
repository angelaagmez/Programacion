package com.abg;

// Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"

public class while2 {
    public static void main(String[] args) {
        int n = 20;
        while (n >= 2 ) {
            System.out.println(n);
            n-=2;
        }
    }
}
