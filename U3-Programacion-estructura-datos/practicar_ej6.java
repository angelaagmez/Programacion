package com.abg;

// Leer 15num por teclado y rotar elementos del array 1 posicion

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        int pos1=0,pos2=0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce los numeros");
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (i==0){
                pos1 = num[i];
                num[i] = num[num.length-1];
            } else {
                pos2 = num[i];
                num[i] = pos1;
                pos1 = pos2;
            }
        }

        System.out.println(Arrays.toString(num));

    }
}
