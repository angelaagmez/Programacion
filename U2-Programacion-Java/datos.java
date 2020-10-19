package com.abg;

import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,apellidos,direccion;

        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce el apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce la direccion");
        direccion = sc.nextLine();

        System.out.println("------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Direccion: "+direccion);
        System.out.println("------------");

        System.out.println("Nombre: "+nombre+"Apellido: "+apellidos+"Direccion: "+direccion);
    }
}
