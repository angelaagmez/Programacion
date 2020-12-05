package com.abg;

// Pedir 8 num y mostrarlos con la palabra par/impar

import java.util.Scanner;

public class practicar_ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce los numeros");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                System.out.println(" par "+numeros[i]);
            } else {
                System.out.println(" impar "+numeros[i]);
            }
        }
    }
}
