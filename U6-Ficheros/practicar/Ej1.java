package practicar;

// ordenar alfabeticamente palabras contenidas en un fichero, en otro llamado palabras_sort.txt
// cada palabra ocupa una linea


import java.io.*;
import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("./src/practicar/palabras.txt"));
            String linea = br.readLine();

            while (linea!=null){
                palabras.add(linea);
                linea = br.readLine();
            }

            palabras.sort((o1, o2) -> ((String)o1).compareToIgnoreCase((String)o2));

            br.close();

        } catch (IOException e){
            e.getMessage();
        }



        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/practicar/palabras_sort.txt"));
            for (int i = 0; i < palabras.size(); i++) {
                bw.write(palabras.get(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e){
            e.getMessage();
        }
    }
}
