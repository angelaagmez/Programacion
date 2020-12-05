package com.abg;

import java.util.Scanner;

public class practicar_cadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad1, cad2;

        System.out.println("Introduce la primera palabra");
        cad1 = sc.nextLine();

        System.out.println("Introduce la segunda palabra");
        cad2 = sc.nextLine();

        if(cad1.length()<cad2.length()){
            System.out.println("La cadena '"+cad1.toUpperCase()+"' es la mas corta");
        }else if(cad2.length()<cad1.length()){
            System.out.println("La cadena '"+cad2.toLowerCase()+"' es la mas corta");
        }

        //dime si si el caracter es mayuscula o minuscula

        for (int i = 0; i <= cad1.length()-1; i++) {
            if(cad1.charAt(i)>=97 && cad1.charAt(i)<=122){
                System.out.println("La letra '"+cad1.charAt(i)+"' es minuscula");
            }else if(cad1.charAt(i)>=65 && cad1.charAt(i)<=90){
                System.out.println("La letra '"+cad1.charAt(i)+"' es mayuscula");

            }
        }

        // Sacar posicion de caracter

        if(cad1.charAt(0)=='H'){
            System.out.println(cad1.charAt(0));
        }
    }

}
