package com.abg;

// Implementar la función divisoresPrimos() que muestra, por consola,
// todos los divisores primos del número que se le pasa como parámetro

import java.util.Scanner;

public class U3_T1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        System.out.println(num+" tiene "+numDivisoresPrimos(num));

        esPrimo2(num);


    }

    public static void esPrimo2(int div){
        for (int i = 1; i <= div; i++) {
            if (esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static int numDivisoresPrimos(int a){
        int num_primos = 0;

        for (int i = 1; i < a; i++) {
            if (esPrimo(i)) {
                num_primos++;
            }
        }
        return num_primos;
    }

    public static boolean esPrimo(int b) {
        for (int i = 2; i < b; i++) {
            if(b%i==0){
                return false;
            }
        }
        return true;
    }
}
