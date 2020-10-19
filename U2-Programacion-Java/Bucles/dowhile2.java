package com.abg;

// Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "do-while"

public class dowhile2 {
    public static void main(String[] args) {

        int n = 20;

        do {
            System.out.println(n);
            n-=2;
        } while (n>=2);

    }
}
