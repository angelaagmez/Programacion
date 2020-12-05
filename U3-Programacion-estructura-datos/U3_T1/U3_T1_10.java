package com.abg;

// Escribir una función que decida si dos números enteros positivos son amigos. Dos números
// son amigos si la suma de los divisores propios (distinto de él mismo) del primer número
// es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

public class U3_T1_10 {
    public static void main(String[] args) {

        System.out.println(amigos(284,220));
    }

    public static boolean amigos(int n1, int n2) {
        int div;
        div = 0;

        for (int i = 1; i < n1 ; i++) {
            if (n1%i==0) {
                div = div + i;
            }
        }

        if (n2==div){
            return true;
        } else {
            return false;
        }
    }
}
