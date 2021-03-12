package U7_T6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pais;
        Map<String,String> capitales = new HashMap<String,String>();

        capitales.put("España","Madrid");
        capitales.put("Portugal","Lisboa");
        capitales.put("Francia","Paris");

        do {
            System.out.println("Escribe el nombre de un pais y te dire su capital");
            pais = sc.nextLine();

            if (!pais.equalsIgnoreCase("salir")){
                if (capitales.containsKey(pais)){
                    System.out.println("La capital de "+pais+" es "+capitales.get(pais));
                } else {
                    System.out.println("No conozco la respuesta, ¿cual es la capital de "+pais+"?");
                    String capital = sc.nextLine();
                    capitales.put(pais,capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }

        } while (!pais.equalsIgnoreCase("salir"));
    }
}
