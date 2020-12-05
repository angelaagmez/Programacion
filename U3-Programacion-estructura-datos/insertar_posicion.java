package com.abg;

import java.util.Arrays;

public class insertar_posicion {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};
        int[] b = {2,5,7,19,21};

        System.out.println(Arrays.toString(insertar(a, 2, 9)));

        System.out.println(Arrays.toString(insertarPrincipio(a, 9)));

        System.out.println(Arrays.toString(insertarFinal(a, 13)));
    }


    public static int[] insertar(int[] v, int pos, int num) {
        if (pos < 0 || pos >= v.length) {
            return v;
        }

        int[] resultado = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            if (i < pos) {
                resultado[i] = v[i];      // antes d la posicion insertamos los mismos numeros q ya estaban
            } else if (i == pos) {
                resultado[i] = num;      // si es igual, insertamos el numero
            } else {
                resultado[i] = v[i - 1];  // insertamos el resto de numeros
            }
        }

        resultado[resultado.length - 1] = v[v.length - 1];

        return resultado;
    }


// Insertar en la primera posicion y en la ultima

    public static int[] insertarPrincipio(int[] v, int num) {
        int[] resultado = new int[v.length + 1];

        resultado[0] = num;

        for (int i = 0; i < v.length; i++) {
            resultado[i + 1] = v[i];   // porque la primera posicion ya la hemos rellenado
        }

        return resultado;
    }

    public static int[] insertarFinal(int[] v, int num) {
        int[] resultado = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i];
        }

        resultado[v.length] = num;     // la ultima posicion

        return resultado;
    }

    public static int[] insertarenorden(int[] v, int num) {
        int[] resultado = new int[v.length+1];

        for (int i = 0; i < v.length; i++) {
            if (v[i]<num) {
                resultado[i] = v[i];
            } //else if (){
                resultado[i] = num;
            }
       // }

        return resultado;
    }

}