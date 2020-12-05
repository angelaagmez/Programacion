package com.abg;

// Pedir 10 num por teclado, mostrar contenido junto a indice
// Pasar numeros primos a primeras posiciones y no primos ultimas

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce los numeros");
            numeros[i] = sc.nextInt();

            System.out.println("Indice: "+i);
        }

        System.out.println("Numeros: ");
        System.out.println(Arrays.toString(numeros));

        pasarprincipio(numeros);
        System.out.println(Arrays.toString(numeros));

    }

    public static boolean primo(int p) {
        for (int i = 2; i < p; i++) {
            if (p%i==0){
                return false;
            }
        }
        return true;
    }

    public static void pasarprincipio(int[] v){
        int[] primos = new int[0];
        int[] noprimos = new int[0];

        for (int i = 0; i < v.length; i++) {
            if (primo(v[i])){
                primos = Arrays.copyOf(primos,primos.length+1);
                primos[primos.length-1] = v[i];
            } else {
                noprimos = Arrays.copyOf(noprimos,noprimos.length+1);
                noprimos[noprimos.length-1] = v[i];
            }
        }

        for (int i = 0; i < v.length; i++) {
            if (i<primos.length) {
                v[i] = primos[i];
            } else {
                v[i] = noprimos[i-primos.length];
            }
        }

    }
}
