package U7_T1;

// Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios. Almacenar en una
// lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que estén repetidas. A
// continuación, mostrar las que no lo estén.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");

        ArrayList<String> lista = new ArrayList<>();


        String[] frase = sc.nextLine().split(" "); // Split - para separar el array por el parametro que digas

        for (int i = 0; i < frase.length; i++) {
            lista.add(frase[i]);
        }

        System.out.println("Palabras: "+lista);

        ArrayList<String> repetidas = new ArrayList<>();
        ArrayList<String> sinrepetir = new ArrayList<>();

        for (String palabra: lista) {
            if (lista.indexOf(palabra)!=lista.lastIndexOf(palabra)){
                repetidas.add(palabra);
            } else {
                sinrepetir.add(palabra);
            }
        }

        System.out.println("Repetidas: "+repetidas);
        System.out.println("Sin repetir: "+sinrepetir);
    }
}
