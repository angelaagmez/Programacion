package com.abg;


// Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la función Math.random().
// Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden
// con los números del 97 al 122.


public class Ejercicio7_3 {
    public static void main(String[] args) {
        int caracter;

        caracter = (int) (Math.random()*(123-97))+97;

        System.out.println("El codigo "+caracter+" es la letra "+(char)caracter);
    }
}
