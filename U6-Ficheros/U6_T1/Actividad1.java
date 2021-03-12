package U6_T1;

// Realizar un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido en pantalla.
// Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto "prueba.txt".

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;



        String contenido = "";

        try{
            System.out.println("Introduce el nombre del fichero (ruta)");
            nombre = sc.nextLine();
            if (nombre.equals("")){
                FileReader in = new FileReader("./src/U6_T1/prueba.txt");
                int c = in.read();

                while (c!=-1){
                    contenido += (char) c;
                    c = in.read();
                }
                in.close();
            } else {
                FileReader in = new FileReader(nombre);
                int c = in.read();

                while (c!=-1){
                    contenido += (char) c;
                    c = in.read();
                }
                in.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contenido);

    }
}
