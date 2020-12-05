package com.abg;

// Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos entre 0 y 500
// (ambos incluidos). A continuaciónel programa mostrará el array y preguntará si el usuario quiere destacar elmáximo
// o el mínimo. Seguidamente se volverá a mostrar el array escribiendoel número destacado entre dobles asteriscos.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int destacar;
        int max = 0;
        int min = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random()*501);

            if(i==0){
                max = num[i];
                min = num[i];
            } else {
                if (num[i]>max){
                    max = num[i];
                }
                if (num[i]<min) {
                    min = num[i];
                }
            }

        }

        System.out.println(Arrays.toString(num));


        /*
        Otras formas de mostrarlo:

        for (int numeros : num) {
            System.out.println(num);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num);
        }

         */


        System.out.println("¿Desea destacar el maximo (1) o el minimo (2) ?");
        destacar = sc.nextInt();


        for (int num2 : num) {
            if (destacar == 1 && num2 == max || destacar == 2 && num2 == min) {
                System.out.println("**"+num2+"**");
            } else {
                System.out.println(num2+" ");
            }
        }


    }
}
