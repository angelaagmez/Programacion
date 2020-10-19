package com.abg;

import java.util.Scanner;

// Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo",
// y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
// Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

public class Ejercicio5_6 {
    public static void main(String[] args) {
        final double g = 9.8;
        double t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tiempo");
        t = sc.nextDouble();

        if (t<0) {
            System.out.println("Tiempo incorrecto");
        } else {
            System.out.println("La velocidad es "+(g*t));
        }
    }
}

