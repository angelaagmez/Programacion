package com.abg;

// Pedir 10num por teclado, mostrar contenido
// Pedir dos posiciones "inicial" y "final", comprobar que inicial es menor que final y ambos num entre 0 y 9
// Colocar el numero de la pos inicial en la final rotando el resto
// Mostrar array resultante

import java.util.Arrays;
import java.util.Scanner;

public class practicar_ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int inicial=0, finall=0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce los numeros");
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num));


        do {
            System.out.println("Introduce posicion inicial");
            inicial = sc.nextInt();
            System.out.println("Introduce posicion final");
            finall = sc.nextInt();
        } while (inicial>finall || inicial>9 || inicial<0 || finall>9 || finall<0);


        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < num.length; i++) {
                if (i<=inicial){
                    if (i==0){
                        pos1 = num[i];
                        num[i] = num[num.length-1];
                    } else {
                        pos2 = num[i];
                        num[i] = pos1;
                        pos1 = pos2;
                    }
                } else if (i==finall) {
                    pos2 = num[i];
                    num[i] = pos1;
                    pos1 = pos2;
                } else if (i>finall){
                    pos2 = num[i];
                    num[i] = pos1;
                    pos1 = pos2;
                }
        }

        System.out.println(Arrays.toString(num));

    }
}
