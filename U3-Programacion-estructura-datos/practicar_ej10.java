package com.abg;

// Generar 20 num aleatorios entre 0 y 100
// Pasar pares a primeras posiciones del array, impares restantes

import java.util.Arrays;

public class practicar_ej10 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*101);
        }

        System.out.println(Arrays.toString(numeros));
        paresimpares(numeros);
        System.out.println(Arrays.toString(numeros));

    }

    public static void paresimpares(int[] v){
        int[] par = new int[0];
        int[] impar = new int[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i]%2==0){
                par = Arrays.copyOf(par,par.length+1);
                par[par.length-1] = v[i];
            } else {
                impar = Arrays.copyOf(impar,impar.length+1);
                impar[impar.length-1] = v[i];
            }
        }

        for (int i = 0; i < v.length; i++) {

            if (i<par.length){
                v[i] = par[i];
            } else {
                v[i] = impar[i-par.length];
            }
        }
    }
}
