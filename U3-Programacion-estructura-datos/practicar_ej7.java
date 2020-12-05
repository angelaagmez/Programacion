package com.abg;

// Generar 100 num aleatorios del 0 al 20 y mostrar por pantalla separados por espacios
// Pedir dos valores y cambiar el primer valor por el segundo

import java.util.Scanner;

public class practicar_ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        int v1,v2;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*21);
            System.out.print(numeros[i]+" ");
        }

        System.out.println("Introduce el valor que quieres cambiar");
        v1 = sc.nextInt();
        System.out.println("Introduce que valor quieres insertar");
        v2 = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==v1) {
                numeros[i] = v2;
            }

            System.out.print(numeros[i]+" ");
        }




    }
}
