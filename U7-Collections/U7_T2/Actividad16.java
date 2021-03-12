package U7_T2;

// Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo HashMap y se comporte de esta forma:
//
//Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de un archivo de texto cuyo nombre se le pasará por parámetro al constructor. Este archivo debe contener varias palabras en español y su traducción al inglés, de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor. Por ejemplo:
//                             hola, hello
//
//                             mundo, world
//
//                             gracias, thanks
//
//                             adios, bye
//
//Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Actividad16 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();


        try {
            BufferedReader leer = new BufferedReader(new FileReader("./src/U7_T2/diccionarioingl.txt"));
            String linea = leer.readLine();

            while (linea!=null){
                String[] palabras = linea.split(",");
                diccionario.put(palabras[0],palabras[1]);
                linea = leer.readLine();
            }

            leer.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(diccionario);

        System.out.println(traductor("hola mundo me llamo Angela, adios"));
    }


    private static String traductor(String frase){
        HashMap<String, String> diccionario2 = new HashMap<>();

        try {
            BufferedReader leer = new BufferedReader(new FileReader("./src/U7_T2/diccionarioingl.txt"));
            String linea = leer.readLine();

            while (linea!=null){
                String[] palabras = linea.split(",");
                diccionario2.put(palabras[0],palabras[1]);
                linea = leer.readLine();
            }

            leer.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        String[] palabras2 = frase.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras2.length; i++) {
            if (diccionario2.get(palabras2[i])!=null){
                resultado += diccionario2.get(palabras2[i])+" ";
            } else {
                resultado += palabras2[i]+" ";
            }
        }
        return resultado;
    }

    //Otra forma: Crear un metodo para leer el archivo e introducirlo en el diccionario, con ese metodo podemos traducir

}
