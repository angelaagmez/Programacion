package com.abg;

// pedir 10 num por teclado y mostrarlos con max y min

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int max = 0;
        int min = 0;



        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce los numeros");
            numeros[i] = sc.nextInt();

            if (i==0){
                max = numeros[i];
                min = numeros[i];
            } else  {
                if (max<numeros[i]){
                    max = numeros[i];
                }
                if (min>numeros[i]){
                    min = numeros[i];
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i]==max){
                System.out.println(" maximo: "+numeros[i]);
            } else if(numeros[i]==min){
                System.out.println(" minimo: "+numeros[i]);
            } else {
                System.out.println(numeros[i]);
            }
        }


    }
}
