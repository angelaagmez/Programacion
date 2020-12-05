package com.abg;

// Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.

import java.util.Scanner;

public class U3_T3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        int tam;
        int numpos = 0;
        int sumpos = 0;
        int numneg = 0;
        int sumneg = 0;
        int numceros = 0;

        System.out.println("Introduce el tamaño del array");
        tam = sc.nextInt();

        numeros = new int[tam];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>0) {
                numpos++;
                sumpos+=numeros[i];
            } else if (numeros[i]<0){
                numneg++;
                sumneg+=numeros[i];
            } else {
                numceros++;
            }
        }

        System.out.println("Numero de ceros: "+numceros);
        System.out.println("Media de positivos: "+((float)sumpos/(float)numpos));
        System.out.println("Media de negativos: "+((float)sumneg/(float)numneg));

    }
}
