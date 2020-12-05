package com.abg;

// Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.

public class U3_T1_12 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n){
        int f;
        f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
