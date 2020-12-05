package com.abg;

// Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.

import java.util.Arrays;

public class U3_T3_9 {
    public static void main(String[] args) {
        int[] apuesta = {1,2,3,4,5,6};
        int[] ganadora = {7,1,3,8,5,6};

        Arrays.sort(apuesta);       // para ordenar los array de menor a mayor
        Arrays.sort(ganadora);

        System.out.println("Numero de aciertos: "+primitiva(apuesta,ganadora));
    }

    public static int primitiva(int[] apuesta, int[] ganadora) {
        int contador;

        contador = 0;

        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    contador++;
                    break;
                }
            }
        }

        return contador;
    }
}
