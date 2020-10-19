package com.abg;

// Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
// Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
// Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

import java.util.Scanner;

public class Ejercicio8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alt,etiq,num,cont;

        alt = 0;
        etiq = 0;
        cont = 0;

        do {
            System.out.println("Introduzca la altura");
            num = sc.nextInt();

            if (num>alt) {
                alt = num;
                etiq = cont;
            }

            cont++;

        } while (num!=-1);

        System.out.println("La altura maxima es "+alt);
        System.out.println("La etiqueta del arbol es "+etiq);

    }
}
