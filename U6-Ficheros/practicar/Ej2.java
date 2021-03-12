package practicar;

// programa para quitar los comentarios de un fichero .java
// crear fichero holav2.java que contiene el codigo sin comentarios

import java.io.*;

public class Ej2 {
    public static void main(String[] args) {

        try{
            BufferedReader leer = new BufferedReader(new FileReader("./src/practicar/hola.java"));
            BufferedWriter escribir = new BufferedWriter(new FileWriter("./src/practicar/holav2.java"));
            String linea = leer.readLine();

            while (linea!=null){
                if (!linea.contains("//")){
                    escribir.write(linea);
                    escribir.newLine();
                }
                linea = leer.readLine();
            }

            leer.close();
            escribir.flush();
            escribir.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
