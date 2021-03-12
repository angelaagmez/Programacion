package U6_T1;

// En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo muestra poco a poco (cada 24 líneas).
// Implementar un programa que funcione de forma similar.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=1;

        try{
            BufferedReader bin = new BufferedReader(new FileReader("./src/U6_T1/ej7.txt"));
            String linea = bin.readLine();

            while (linea!=null){
                if (cont%24==0){
                    System.out.println(linea);
                    sc.nextLine();
                } else {
                    System.out.println(linea);
                }
                cont++;
                linea = bin.readLine();

            }
            bin.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
