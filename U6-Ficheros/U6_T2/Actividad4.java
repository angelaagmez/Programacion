package U6_T2;

// Pedir un entero n por consola. A continuación, pedir n números double, que iremos guardando en una tabla.
// Guardar la tabla en un archivo binario.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double num;
        double[] numeros;

        System.out.println("Introduce un numero de enteros");
        n = sc.nextInt();

        numeros = new double[n];

        System.out.println("Introduce "+n+" numeros decimales");

        for (int i = 0; i < numeros.length; i++) {
            num = sc.nextDouble();
            numeros[i] = num;
        }

        try{
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("./src/U6_T2/actividad4.abg"));
            flujoSalida.writeObject(numeros);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
