package U6_T2;

// Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se introduzca un número
// negativo. Leer del fichero todos los enteros guardados y mostrarlos por pantalla.

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        do{
            System.out.println("Introduce el numero");
            num = sc.nextInt();

            try{
                ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("./src/U6_T2/actividad3.abg", true));
                flujoSalida.writeInt(num);
                flujoSalida.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (num>=0);

        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/actividad3.abg"));
            while (true){
                System.out.println(flujoEntrada.readInt());
                flujoEntrada.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
