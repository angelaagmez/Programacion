package com.abg;

import java.util.Scanner;

public class Ejercicio4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1,n2,n3;

        System.out.println("Introduce el primer numero");
        n1 = sc.nextFloat();

        System.out.println("Introduce el segundo numero");
        n2 = sc.nextFloat();

        System.out.println("Introduce el tercer numero");
        n3 = sc.nextFloat();

        System.out.println("La media es: "+(int)(n1+n2+n3)/3);

    }
}
