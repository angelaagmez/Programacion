package com.abg;

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        // Float para decimales

        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();
        // nextfloat para decimales

        System.out.println("La suma es "+(a+b));
        System.out.println("La resta es "+(a-b));

        // a = a + 2;
        // a += 2;

        // a = a * 10;
        // a *= 10;

        // a++; sumar 1 dsps de lo d antes
        // ++a; si lo ponemos dsps de a++ se sumara 2 porq se sumas dsps de lo anterior


    }
}
