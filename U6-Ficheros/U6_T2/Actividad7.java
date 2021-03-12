package U6_T2;

// Escribir por teclado una frase y guardarla en un archivo binario. A continuación, recuperarla del archivo y
// mostrarla por pantalla.

import java.io.*;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        try{
            System.out.println("Introduce la frase");
            frase = sc.nextLine();

            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("./src/U6_T2/actividad7.abg"));
            flujoSalida.writeObject(frase);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/actividad7.abg"));
            System.out.println((String)flujoEntrada.readObject());
            flujoEntrada.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
