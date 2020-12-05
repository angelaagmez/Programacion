package com.abg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class fusion {
    public static void main(String[] args) {
        int[] v = {4,6,1,89,12};
        int[] x = {8,9,12,3,200,123,45,67,99};

        System.out.println(Arrays.toString(fusion(v,x)));
    }

    public static int[] fusion(int[] a, int[] b) {
        int[] resultado;

        resultado = Arrays.copyOf(a,a.length+b.length);

        for (int i = 0; i < b.length; i++) {
            resultado[a.length+i] = b[i];
        }

        Arrays.sort(resultado);

        return resultado;
    }

}
