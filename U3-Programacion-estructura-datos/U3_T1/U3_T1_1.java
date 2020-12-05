package com.abg;

// Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el
// mensaje "Eco..."


public class U3_T1_1 {
    public static void main(String[] args) {
        eco(6);

        mostrarEntero(10,30);
    }

    public static void eco(int n){
        for (int i = 0; i < n ; i++) {
            System.out.println("ECO");
        }
    }


    // Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

    public static void mostrarEntero(int a, int b){
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
