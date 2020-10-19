package com.abg;

// Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero).
// Se repetirá hasta que el usuario introduzca como login "1809" y como contraseña "1234".
// En esta ocasión, hazlo con do-while.

import java.util.Scanner;

public class dowhile5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user,passwd;

        System.out.println("Introduce tu usuario");
        user = sc.nextInt();
        System.out.println("Introduce tu contraseña");
        passwd = sc.nextInt();

        do {
            System.out.println("Contraseña incorrecta");
            System.out.println("Introduce de nuevo tu usuario");
            user = sc.nextInt();
            System.out.println("Introduce de nuevo tu contraseña");
            passwd = sc.nextInt();
        } while (passwd!=1234 || user!=1089);

    }
}
