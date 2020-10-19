package com.abg;

import java.util.Scanner;

// Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el valor del
// menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".

public class Ejercicio6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1,n2,menor;

        System.out.println("Introduce un numero");
        n1 = sc.nextByte();

        System.out.println("Introduce otro numero");
        n2 = sc.nextByte();

        if (n1>n2) {
            menor=n2;
        } else {
            menor=n1;
        }

        // menor = (n1>n2) ? menor=n2 : menor=n1);

        System.out.println("Es menor "+menor);
    }
}
