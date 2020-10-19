package com.abg;

// Diseñar un programa que muestre el producto de los 10 primeros números impares.

import java.util.Scanner;

public class Ejercicio8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,result=1;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        /*
                MODIFICAAAAAAARRR
         */


        for (int i=1; i>=num; i++) {
            result=result*i;
        }

        System.out.println("Factorial de "+num+" es: "+result);
    }
}
