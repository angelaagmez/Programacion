package com.abg;

// Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero).
// Se repetirá mientras el usuario introduzca un login distinto de "1809" o una contraseña distinta de "1234".

import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwd,user;

        System.out.println("Introduce el usuario");
        user = sc.nextInt();

        System.out.println("Introduce la contraseña");
        passwd = sc.nextInt();

        while (passwd!=1234 || user!=1809) {
            System.out.println("Contraseña o usuario incorrecto");
            System.out.println("Vuelve a introducir el usuario");
            user = sc.nextInt();
            System.out.println("Vuelve a introducir la contraseña");
            passwd = sc.nextInt();
        }

        System.out.println("Está usted dentro del sistema");

    }
}
