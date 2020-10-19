package com.abg;

import java.util.Scanner;

// Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
// Hazlo primero con un "if" y luego con un "operador condicional".

public class Ejercicio6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,v;

        System.out.println("Introduce un numero");
        n = sc.nextInt();

        if (n%2==0){
            v=1;
        } else {
            v=0;
        }


        // v = (n%2==0) ? 1 : 0;
        // System.out.println(v);
    }
}
