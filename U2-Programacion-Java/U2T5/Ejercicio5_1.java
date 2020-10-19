package com.abg;

import java.util.Scanner;

public class Ejercicio5_1 {
    // Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
    // o si, por el contrario, no lo es (usando "else").

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el numero");
        n = sc.nextInt();

        if (n>=0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
