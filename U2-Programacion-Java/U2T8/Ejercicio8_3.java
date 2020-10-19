package com.abg;

// Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números
// tratando de acertarlo. El programa debe indicar "mayor" o "menor" según el número secreto sea mayor
// o menor que el introducido por el usuario. El proceso finaliza cuando el usuario acierta o cuando
// se rinde (introduciendo un -1).

import java.util.Scanner;

import static java.lang.Math.random;

public class Ejercicio8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int num = (int) (Math.random()*100+1);

        System.out.println("Adivina el numero");
        n = sc.nextInt();


        while (n!=-1) {
            if(n>num){
                System.out.println("El numero es menor");
            } else if (n<num){
                System.out.println("El numero es mayor");
            } else {
                System.out.println("Has acertado");
                break;
            }
            System.out.println("Adivina el numero");
            n = sc.nextInt();
        }


    }
}
