package com.abg;

import java.util.Scanner;

public class U3_T1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        System.out.println(num+"tiene "+numDivisoresPrimos(num));
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
