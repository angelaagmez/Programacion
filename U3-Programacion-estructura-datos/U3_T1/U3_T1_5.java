package com.abg;

// Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco, no hagas el
// algoritmo de comparación de los 3 números desde cero

public class U3_T1_5 {
    public static void main(String[] args) {
        System.out.println(mayor3(9,1,34));

    }

    public static int mayor2(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    public static int mayor3 (int a, int b, int c) {
        if (mayor2(a,b)>c) {
            return mayor2(a,b);
        } else {
            return c;
        }
    }
}
