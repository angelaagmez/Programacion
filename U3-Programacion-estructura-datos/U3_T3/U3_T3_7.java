package com.abg;

// Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada clase está
// compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer
// trimestre, luego, las del segundo, y luego, las del tercero. Debemos mostrar, al final, la nota media del grupo
// en cada trimestre, y la media del alumno que se encuentra en la posición pos (que se lee por teclado).
// (Podéis hacerlo usando 3 vectores -uno por trimestre).

import java.util.Arrays;
import java.util.Scanner;

public class U3_T3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n1 = new int[5];
        int[] n2 = new int[5];
        int[] n3 = new int[5];

        double media1,media2,media3,mediaalum;

        media1 = 0;
        media2 = 0;
        media3 = 0;
        mediaalum = 0;

        int pos;

        for (int i = 0; i < n1.length; i++) {
            System.out.println("Introduce las notas del primer trimestre");
            media1 += n1[i] = sc.nextInt();

            System.out.println("Introduce las notas del segundo trimestre");
            media2 += n2[i] = sc.nextInt();

            System.out.println("Introduce las notas del tercer trimestre");
            media3 += n3[i] = sc.nextInt();
        }

        System.out.println("Notas del primer trimestre: "+Arrays.toString(n1));
        System.out.println("Notas del segundo trimestre: "+Arrays.toString(n2));
        System.out.println("Notas del tercer trimestre: "+Arrays.toString(n3));

        media1 = media1/5;
        media2 = media2/5;
        media3 = media3/5;

        System.out.println("Media del primer trimestre: "+media1);
        System.out.println("Media del segundo trimestre: "+media2);
        System.out.println("Media del tercer trimestre: "+media3);

        for (int i = 0; i < n1.length; i++) {
           mediaalum = n1[i]+n2[i]+n3[i];
           mediaalum = mediaalum/3;

           System.out.println("Notas del alumno "+i+": "+mediaalum);

        }

        System.out.println("Introduce el alumno del que quieres ver la media");
        pos = sc.nextInt();

        mediaalum = n1[pos]+n2[pos]+n3[pos];
        mediaalum = mediaalum/3;

        System.out.println("Notas del alumno "+pos+": "+mediaalum);

    }

}
