package com.abg;

// Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

import java.util.Scanner;

public class Ejercicio8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean suspensos = false;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Introduce la nota");
            nota = sc.nextInt();

            if (nota<5) {
                suspensos = true;
            }
            if (suspensos){
                System.out.println("Hay algun suspenso");
            }
        }
    }
}
