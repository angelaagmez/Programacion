package com.abg;

// Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las palabras
// correspondientes a colores se deben almacenar alcomienzo y las que no son colores a continuación.
// Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el programa deben estar
// enotro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T4_2 {
    public static void main(String[] args) {
        String[] palabras = new String[8];
        String[] colores = {};
        String[] otros = {};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra en la posición "+i);
            palabras[i] = sc.nextLine();

            if (esColor(palabras[i])) {
                colores = Arrays.copyOf(colores,colores.length+1);
                colores[colores.length-1] = palabras[i];
            } else {
                otros = Arrays.copyOf(otros,otros.length+1);
                otros[otros.length-1] = palabras[i];
            }
        }

        int taminicial = colores.length;
        colores = Arrays.copyOf(colores, colores.length+otros.length);

        for (int i = 0; i < otros.length ; i++) {
            colores[taminicial+i] = otros[i];
        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(otros));



    }

    public static boolean esColor(String palabra) {
        String[]  listaColores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};

        for (int i = 0; i < listaColores.length; i++) {
            if (listaColores[i].equalsIgnoreCase(palabra)) {
                return true;
            }
        }

        return false;
    }
}
