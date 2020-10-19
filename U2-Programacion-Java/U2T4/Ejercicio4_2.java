package com.abg;

import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.println("Introduce el primer numero");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        n2 = sc.nextInt();

        System.out.println("La media es: "+(float)(n1+n2)/2);

    }
}
