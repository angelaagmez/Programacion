package U6_T1;

// En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). Diseñar un programa que procese
// el fichero y nos muestre el menor y el mayor.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad5 {
    public static void main(String[] args) {
        String contenido = "";
        int max=0,min=0,cont=0;

        try{
            BufferedReader in = new BufferedReader(new FileReader("./src/U6_T1/numeros.txt"));

            String linea = in.readLine();


            while (linea!=null){

                int c = Integer.parseInt(linea);

                if (cont==0){
                    max = c;
                    min = c;
                } else {
                    if (max<c){
                        max = c;
                    }
                    if (min>c){
                        min = c;
                    }
                }
                linea = in.readLine();
                cont++;
            }

            in.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);

    }
}
