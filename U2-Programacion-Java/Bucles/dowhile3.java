package com.abg;

// Crea un programa que muestre la "tabla de multiplicar del 5", usando "do-while"

public class dowhile3 {
    public static void main(String[] args) {
        int n = 1;

        do{
            System.out.println("5x"+n+"="+n*5);
            n++;
        } while (n<=10);
    }
}
