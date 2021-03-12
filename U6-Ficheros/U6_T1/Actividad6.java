package U6_T1;

// Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar. Crear una
// aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre (comprobando que no se encuentre
// repetido). Llamaremos al fichero firmas.txt.

import java.io.*;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        System.out.println("Indique si desea mostrar o insertar en el libro de firmas");
        opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("mostrar")){
            String contenido = "";

            try{
                BufferedReader in = new BufferedReader(new FileReader("./src/U6_T1/firmas.txt"));

                String linea = in.readLine();

                while (linea!=null){
                    contenido+=linea+"\n";
                    linea = in.readLine();
                }

                in.close();

            } catch (IOException e){
                System.out.println(e.getMessage());
            }

            System.out.println(contenido);

        } else if (opcion.equalsIgnoreCase("insertar")){
            String firma;
            System.out.println("Introduce tu firma: ");
            firma = sc.nextLine();
            try{

                FileWriter out = new FileWriter("./src/U6_T1/firmas.txt",true);
                BufferedWriter bw = new BufferedWriter(out);

                if (!estaFirmado(firma)){
                    bw.write(firma);
                    bw.newLine();
                    bw.flush();
                }

            } catch (IOException e){
                System.out.println(e.getMessage());
            }


        }


    }

    public static boolean estaFirmado(String firma){
        try{
            BufferedReader in = new BufferedReader(new FileReader("./src/U6_T1/firmas.txt"));
            String linea = in.readLine();
            while (linea!=null){
                if (linea.equalsIgnoreCase(firma)){
                    return true;
                }
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
