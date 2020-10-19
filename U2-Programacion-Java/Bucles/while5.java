package com.abg;

// Crea un programa que pida al usuario su contraseña (un número entero).
// Se repetirá mientras introduzca una contraseña distinta de "1234".

import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwd;

        System.out.println("Introduce la contraseña");
        passwd = sc.nextInt();

        while (passwd!=1234) {
            System.out.println("Contraseña incorrecta");
            System.out.println("Vuelve a introducir la contraseña");
            passwd = sc.nextInt();
        }

        System.out.println("Contraseña correcta");

    }
}
