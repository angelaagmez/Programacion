package U6_T1;

// Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
//
//Duplicaremos el fichero original.txt en uno que se llame copia.txt
//Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el prefijo "copia_de".

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad3 {
    public static void main(String[] args) {
        try{
            FileReader in = new FileReader("./src/U6_T1/datos.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/U6_T1/nuevosdatos.txt"));

            int c = in.read();

            while (c!=-1){
                bw.write((char)c);
                c = in.read();
            }

            in.close();
            bw.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
