package libro;

import java.util.ArrayList;
import java.util.List;

public class Ej2_cartas {
    public static void main(String[] args) {
        List listacartas = new ArrayList<Ejercicio2>();

        String[] numcarta = {"1","2","3","4","5","6","7","10","11","12"};
        String[] tipocarta = {"espada","oro","basto","copas"};


        while (listacartas.size()<11){
            String n = numcarta[(int)(Math.random()*10)];
            String t = tipocarta[(int)(Math.random()*4)];
            Ejercicio2 carta = new Ejercicio2(n,t);

            if (!listacartas.contains(carta)){
                listacartas.add(carta);
            }
        }

        System.out.println(listacartas);
    }
}
