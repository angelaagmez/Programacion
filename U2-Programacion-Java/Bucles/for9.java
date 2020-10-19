package com.abg;

// Crea un programa que pida al usuario un número entero largo y diga si es primo
// (si sólo es divisible entre 1 y él mismo).

import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        boolean primo = true;

        System.out.println("Introduce un numero");
        num = sc.nextLong();

        for (int i=2; i<num; i++){
            if(num%i==0) {
                primo = false;
                break;
            }
        }

        if (primo){
            System.out.println("Es un numero primo");
        } else {
            System.out.println("No es un numero primo");
        }

    }
}
