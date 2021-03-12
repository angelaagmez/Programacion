package U6_T2;

// Pedir un double por consola y guardarlo en un archivo binario.

import java.io.*;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Introduce un numero con decimales");
        num = sc.nextDouble();

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("./src/U6_T2/actividad1.abg"));
            flujoSalida.writeDouble(num);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
