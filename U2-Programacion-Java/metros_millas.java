package com.abg;

import java.util.Scanner;

public class metros_millas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Float m;

        System.out.println("Introduce el numero de millas");
        m = sc.nextFloat();

        System.out.println(m+" millas son "+(m*1609)+" metros");

    }
}
