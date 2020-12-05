package com.abg;

// Diseñar una función que nos diga si un número es primo.

public class U3_T1_7 {
    public static void main(String[] args) {
        System.out.println(primo(7));
    }

    public static boolean primo(int num) {
        int num2;
        num2 = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num2++;
            }
        }

        if (num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
