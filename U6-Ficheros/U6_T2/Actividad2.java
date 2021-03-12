package U6_T2;

// Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Actividad2 {
    public static void main(String[] args) {
        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/actividad1.abg"));
            System.out.println(flujoEntrada.readDouble());
            flujoEntrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
