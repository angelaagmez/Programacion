package U7_T2;

// Implementar la función leeCadena con el siguiente prototipo:
//
//List<Character>leeCadena()
//
//Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        System.out.println(leeCadena());

    }

    public static List<Character> leeCadena(){
        List resultado = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduce la cadena");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            resultado.add(frase.charAt(i));
        }

        /*String[] v = frase.split(" ");
        for (int i = 0; i < v.length; i++) {
            resultado.add(v[i].charAt(0));
        }*/


        return resultado;
    }
}
