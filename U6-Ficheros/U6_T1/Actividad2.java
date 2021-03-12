package U6_T1;

// Diseñar una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero "datos.txt".
// Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        try{
            System.out.println("Introduce tu nombre y edad");
            nombre = sc.nextLine();
            edad = sc.nextInt();

            FileWriter out = new FileWriter("./src/U6_T1/datos.txt");
            BufferedWriter bw = new BufferedWriter(out);

            bw.write("Nombre: "+nombre);
            bw.newLine();
            bw.write("Edad: "+edad);

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
