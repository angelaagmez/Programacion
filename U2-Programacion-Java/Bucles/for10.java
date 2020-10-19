package com.abg;

// Crea un programa que pida al usuario dos números enteros largos y diga cuántos números primos hay
// entre ellos (ambos incluidos).

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        boolean primo = true;

        System.out.println("Introduce el primer numero");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        n2 = sc.nextInt();

        for (int i=n1; i<=n2; i++) {
            primo = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    primo = false;
                    break;
                }
            }

            if (primo){
                System.out.println("El numero "+i+" es primo");
            }

        }
    }
}
