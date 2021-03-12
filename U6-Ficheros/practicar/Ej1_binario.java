package practicar;

import java.io.*;
import java.util.ArrayList;

public class Ej1_binario {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        try{
            BufferedReader leer = new BufferedReader(new FileReader("./src/practicar/palabras.txt"));
            String linea = leer.readLine();

            while (linea!=null){
                palabras.add(linea);
                linea = leer.readLine();
            }

            palabras.sort((o1, o2) -> ((String)o1).compareToIgnoreCase((String)o2));

            leer.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/practicar/palabras_sortbinario.abg"));

            for (int i = 0; i < palabras.size(); i++) {
                escribir.writeObject(palabras.get(i));
            }

            escribir.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            ObjectInputStream mostrar = new ObjectInputStream(new FileInputStream("./src/practicar/palabras_sortbinario.abg"));
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println(mostrar.readObject());
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
