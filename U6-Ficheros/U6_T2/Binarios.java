package U6_T2;

import java.io.*;
import java.util.Arrays;

public class Binarios {
    public static void main(String[] args) {
        Persona p = new Persona("Pepa","Perez");
        Persona p1 = new Persona("Lola","Flores");
        Persona p2 = new Persona("Manuel","Rodriguez");
        int[] num = {1,2,3,4,5,6,7,8};

        try{
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("./src/U6_T2/prueba.abg"));
            flujoSalida.writeInt(50);
            flujoSalida.writeObject(p);
            flujoSalida.writeObject(p1);
            flujoSalida.writeObject(p2);
            flujoSalida.writeObject(num);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/prueba.abg"));
            System.out.println(flujoEntrada.readInt());
            System.out.println((Persona)flujoEntrada.readObject());
            System.out.println((Persona)flujoEntrada.readObject());
            System.out.println((Persona)flujoEntrada.readObject());
            System.out.println(Arrays.toString((int[])flujoEntrada.readObject()));
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        /*try {
            while (true) {
                ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./src/U6_T2/prueba.abg"));
                System.out.println(flujoEntrada.readInt());
            }
        } catch (EOFException | FileNotFoundException ex) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }
}
