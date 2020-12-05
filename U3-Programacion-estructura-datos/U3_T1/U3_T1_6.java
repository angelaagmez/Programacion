package com.abg;

// Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de
// entrada corresponde con una vocal.

public class U3_T1_6 {
    public static void main(String[] args) {
        System.out.println(esVocal('A'));
        System.out.println(esVocal('a'));
        System.out.println(esVocal('H'));
    }

    public static boolean esVocal(char c) {
        String cadena = Character.toString(c);
        cadena = cadena.toUpperCase();
        c = cadena.charAt(0);

        if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        } else {
            return false;
        }
    }
}
