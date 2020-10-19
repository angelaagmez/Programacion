package com.abg;

// Crea un programa que muestre los números enteros entre 0 y el que introduzca el usuario que sean
// múltiplos de 3 (el resto al dividir por 3 es 0) y a la vez múltiplos de 7 (ídem).

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2;

        System.out.println("Introduce el numero");
        n2 = sc.nextInt();

        for ( int n1=0 ; n1<=n2 ; n1++){
            if ((n1%3==0) && (n1%7==0)){
                System.out.println("Es multiplo de 3 y 7: "+n1);
            }
        }
    }
}
