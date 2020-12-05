package com.abg;

// Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
// Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas
// y acentuadas). El resto de caracteres no se modifican.

import java.util.Scanner;

public class U3_T2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,resultado;

        resultado = "";

        System.out.println("Introduce tu nombre y apellido");
        nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i)!='a' && nombre.charAt(i)!='e' && nombre.charAt(i)!='i' && nombre.charAt(i)!='o' && nombre.charAt(i)!='u'
            || nombre.charAt(i)!='A' && nombre.charAt(i)!='E' && nombre.charAt(i)!='I' && nombre.charAt(i)!='O' && nombre.charAt(i)!='U') {
                resultado += nombre.charAt(i);
            }
        }

        System.out.println(resultado);

    }
}
