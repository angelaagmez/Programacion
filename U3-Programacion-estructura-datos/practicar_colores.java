package com.abg;

// Escribe un programa que pida 8 palabras y las almacene en un array. Las palabras correspondientes a
// colores se deben almacenar alcomienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
// auxiliares como quieras. Los colores que conoce el programa deben estar enotro array y son los siguientes: verde,
// rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.

import java.util.Arrays;
import java.util.Scanner;

public class practicar_colores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];
        String[] colores = {};
        String[] otros = {};

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce las palabras");
            palabras[i] = sc.nextLine();

            if (soncolores(palabras[i])){
                colores = Arrays.copyOf(colores,colores.length+1);
                colores[colores.length-1] = palabras[i];
            } else {
                otros = Arrays.copyOf(otros,otros.length+1);
                otros[otros.length-1] = palabras[i];
            }
        }

        int guardartamaño = colores.length;
        colores = Arrays.copyOf(colores,colores.length+otros.length);

        for (int i = 0; i < otros.length; i++) {
            colores[guardartamaño+i] = otros[i];
        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(colores));

    }

    public static boolean soncolores(String color) {
        String[] conoce = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro","blanco", "morado"};

        for (int i = 0; i < conoce.length; i++) {
            if (conoce[i].equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

}
