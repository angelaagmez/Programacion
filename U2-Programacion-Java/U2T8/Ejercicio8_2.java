package com.abg;

// Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los
// alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación
// mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos
// son mayores de edad.

import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad,suma,num,mayor;

        System.out.println("Introduce la edad");
        edad = sc.nextInt();

        suma = 0;
        num = 0;
        mayor = 0;

        while (edad>0) {
            num++;
            suma = suma + edad;

            if (edad>18) {
                mayor++;
            }

            System.out.println("Introduce la edad");
            edad = sc.nextInt();
        }

        System.out.println("La suma de las edades es "+suma);
        System.out.println("La media de las edades es "+(suma/num));
        System.out.println("Hemos introducido la edad de "+num+" alumnos");
        System.out.println("Son mayores de edad "+mayor+" alumnos");

    }
}
