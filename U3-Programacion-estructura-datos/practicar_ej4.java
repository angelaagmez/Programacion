package com.abg;

// 3 arrays de 20 num - numero, cuadrado, cubo
// numero = aleatorios de 0 a 100
// cuadrado = cuadrados de los valores de numero
// cubo = cubos de los valores de numero
// Mostrar contenido de los arrays en columnas

import java.lang.reflect.Array;
import java.util.Arrays;

public class practicar_ej4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random()*101);

            cuadrado[i] = (int)(Math.pow(numero[i],2));

            cubo[i] = (int)(Math.pow(numero[i],3));
        }

        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(cuadrado));
        System.out.println(Arrays.toString(cubo));

    }
}
