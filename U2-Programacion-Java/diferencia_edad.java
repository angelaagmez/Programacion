package com.abg;

import java.util.Scanner;

public class diferencia_edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short nacimiento,año;

        System.out.println("Introduce el año de nacimiento");
        nacimiento = sc.nextShort();
        System.out.println("Introduce el año actual");
        año = sc.nextShort();

        System.out.println("Tu edad es :"+(año-nacimiento));
    }
}
