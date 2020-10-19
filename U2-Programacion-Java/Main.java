package com.abg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();

        System.out.println("Hola "+nombre);
    }
}
