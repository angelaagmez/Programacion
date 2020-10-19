package com.abg;

// Escribir todos los múltiplos de 7 menores que 100

public class Ejercicio8_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            if (i%7==0) {
                System.out.println("El numero "+i+" es multiplo de 7");
            }
        }
    }
}
