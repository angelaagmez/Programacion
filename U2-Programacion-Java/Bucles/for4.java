package com.abg;

// Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos
// de 6 (el resto al dividir por 6 sea 0).

public class for4 {
    public static void main(String[] args) {
        for (int n=0 ; n<=100 ; n++) {
            if (n%6==0){
                System.out.println("Los multiplos de 6 son: "+n);
            }
        }
    }
}
