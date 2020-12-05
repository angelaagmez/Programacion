package com.abg;

// Temperatura media que ha hecho en cada mes de un determinado año y mostrar diagrama de barras

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class practicar_ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[12];

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce la temperatura media que ha hecho en cada mes");
            temp[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < temp.length; i++) {

        }

    }
}
