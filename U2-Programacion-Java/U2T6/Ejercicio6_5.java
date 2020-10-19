package com.abg;

import java.util.Scanner;

import static java.lang.Math.PI;

// Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a continuación muestre
// un pequeño menú con 3 opciones:
//         1.Calcular diámetro    2.Calcular perímetro    3.Calcular área
// Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
// (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

public class Ejercicio6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio;

        System.out.println("Introduce el radio");
        radio = sc.nextDouble();
        sc.nextLine();  // para poder leer caracteres despues de numeros (salto de linea)

        System.out.println("Introduce la opcion");
        System.out.println("1. Calcular diametro");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Calcular area");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El diametro es "+(2*radio));
                break;
            case 2:
                System.out.println("El perimetro es "+(2*PI*radio));
                break;
            case 3:
                System.out.println("El area es "+(PI*radio*radio));
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
}
