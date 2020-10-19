package com.abg;

// Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello
// asteriscos (*). Por ejemplo, para n=4:

import java.util.Scanner;

public class Ejercicio8_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;

        System.out.println("Introduce el tamaño de la figura");
        tam = sc.nextInt();

        for (int i=0; i<tam; i++) {
            for (int j=0; j<tam-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
