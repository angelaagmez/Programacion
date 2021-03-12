package U6_T2;

// Leer de un fichero binario una tabla de números double. Mostrar el contenido de la tabla por consola.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Actividad5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/actividad4.abg"));
            System.out.println(Arrays.toString((double[])flujoEntrada.readObject()));
            flujoEntrada.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
