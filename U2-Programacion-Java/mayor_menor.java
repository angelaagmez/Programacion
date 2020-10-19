package com.abg;

import java.util.Scanner;

public class mayor_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.println("Introduzca los dos numeros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println("Es mayor "+n1);
        } else if (n2>n1){
            System.out.println("Es mayor "+n2);
        } else {
            System.out.println("Son iguales");
        }

        /*
        if (n<18) {
            System.out.println("Es adolescente");
        } else if (n>=18 && n<65){
            System.out.println("Es adulto");
        } else if (n>=65 && n<100){
            System.out.println("Es jubilado");
        } else {
            System.out.println("F");
        }
         */

    }
}
