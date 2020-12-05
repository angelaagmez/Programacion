package com.abg;

// Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La aplicación genera
// de forma aleatoria, una combinación secreta de n dígitos del 1 al 5 (siendo n la longitud indicada anteriormente
// por el usuario). El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista,
// para cada dígito, si es mayor menor o igual que el correspondiente de la combinación secreta.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] clave;
        int tam;
        String claveusuario;

        System.out.println("Introduce el tamaño de la clave");
        tam = sc.nextInt();

        clave = new int[tam];

        for (int i = 0; i < clave.length; i++) {
            clave[i] = (int) (Math.random() * 5 * 1);
        }

        // System.out.println(Arrays.toString(clave));

        sc.nextLine();

        do {
            System.out.println("Adivina la clave");
            claveusuario = sc.nextLine();


            for (int i = 0; i < clave.length; i++) {
                int a = Integer.parseInt(claveusuario.substring(i, i + 1));

                if (clave[i] > a) {
                    System.out.println(claveusuario.charAt(i) + " es menor");
                } else if (clave[i] < a) {
                    System.out.println(claveusuario.charAt(i) + " es mayor");
                } else {
                    System.out.println(clave[i] + " es igual");
                }
            }
        } while (!iguales(clave, claveusuario));

        System.out.println("HAS ACERTADO");
    }


    public static boolean iguales(int[] numeros, String claveusuario) {
        for (int i = 0; i < numeros.length; i++) {
            int a = Integer.parseInt(claveusuario.substring(i, i + 1));

            if (numeros[i] != a) {
                return false;
            }
        }

        return true;
    }

}


