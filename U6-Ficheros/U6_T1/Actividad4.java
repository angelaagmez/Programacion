package U6_T1;

// Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos que contar los caracteres, las líneas y
// las palabras. Para facilitar el procesamiento supondremos que cada palabra está separada de otra por un único espacio en blanco.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4 {
    public static void main(String[] args) {
        int contpalabras = 1, contcaract = 0, contlineas = 1;
        final int nuevaLinea = 10;

        String contenido = "";

        try {
            FileReader in = new FileReader("./src/U6_T1/carta.txt");
            int c = in.read();

            while (c!=-1){
                contenido += (char) c;

                contcaract++;

                if ((char) c == ' '){
                    contpalabras++;
                }

                if (c==nuevaLinea){
                    contlineas++;
                    contpalabras++;
                    contcaract--;
                }

                c = in.read();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(contenido);
        System.out.println("");
        System.out.println("Numero de palabras: "+contpalabras);
        System.out.println("Numero de caracteres: "+contcaract);
        System.out.println("Numero de lineas: "+contlineas);


    }
}
