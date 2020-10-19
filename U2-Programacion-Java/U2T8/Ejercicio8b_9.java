package com.abg;

// Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
// El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

import java.util.Scanner;

public class Ejercicio8b_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        for (int i=0; i<altura; i++) {
            if (i<altura-1){
                System.out.println("*");
            } else {
                for (int j = 0; j < altura/2+1 ; j++) {
                    System.out.print("* ");
                }
            }
        }

    }
}
