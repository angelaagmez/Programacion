package com.abg;

import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        while (num!=0) {
            if (num%2==0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            if (num>0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            System.out.println("El cuadrado del numero es "+Math.pow(num,2));

            System.out.println("Introduce el numero");
            num = sc.nextInt();
        }

    }
}
