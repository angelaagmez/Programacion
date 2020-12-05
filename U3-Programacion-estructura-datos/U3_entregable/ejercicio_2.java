// Crea una función con la siguiente cabecera:
//
//public String convierteEnMorse(int n)
//
//Esta función convierte el número n al sistema Morse y lo devuelve en una
//cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
//Morse. Utiliza esta función en un programa para comprobar que funciona bien.
//Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
//desde el programa principal.
//
//1 . _ _ _ _ 6 _ . . . .
//2 . . _ _ _ 7 _ _ . . .
//3 . . . _ _ 8 _ _ _ . .
//4 . . . . _ 9 _ _ _ _ .
//5 . . . . . 0 _ _ _ _ _

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero para cambiar a Morse");
        num = sc.nextInt();

        System.out.println(convierteEnMorse(num));
    }

    public static String convierteEnMorse(int n){
        String[] morse = {"-----","·----","··---","···--","····-","·····","-····","--···","---··","----·"};
        for (int i = 0; i < n; i++) {
            morse [i] = morse[n];
        }
        return morse[n];
    }

}
