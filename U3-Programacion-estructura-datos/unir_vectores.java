package com.abg;

import java.util.Arrays;

public class unir_vectores {
    public static void main(String[] args) {
        Integer[] v1 = {2,3,4,5,6,7,8,9};
        Integer[] v2 = {2,3,4,5,6,7};

        System.out.println(Arrays.toString(unir(v1,v2)));
        System.out.println(Arrays.toString(unir(v2,v1)));
    }


    public static Integer[] unir(Integer[] v1,Integer[] v2) {
        Integer[] resultado = new Integer[v1.length+v2.length];
        
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            resultado[i+v1.length] = v2[i];
        }

        return resultado;

    }
}

