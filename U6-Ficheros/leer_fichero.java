import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leer_fichero {
    public static void main(String[] args) {

        // LEER MENSAJE UNO A UNO / CARACTER A CARACTER

        String contenido = "";

        try {
            FileReader in = new FileReader("./src/fichero_prueba.txt");
            int c = in.read();

            while (c != -1) {
                contenido += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(contenido);


        //LEER MENSAJE POR BLOQUES

        String contenido2 = "";

        try {
            BufferedReader inb = new BufferedReader(new FileReader("./src/fichero_prueba.txt"));

            String linea = inb.readLine();
            while (linea!=null){
                contenido2 += linea+"\n";
                linea = inb.readLine();
            }
            inb.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(contenido2);

    }
}
