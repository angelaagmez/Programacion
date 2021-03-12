package U7_T6;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ajedrez {
    public static void main(String[] args) {
        Map<String, Integer> piezas = new LinkedHashMap<String,Integer>();

        piezas.put("Dama",9);
        piezas.put("Torre",5);
        piezas.put("Alfil",3);
        piezas.put("Caballo",2);
        piezas.put("Peon",1);

        List<Piezas> piezas_capturadas = new LinkedList<>();

       /* do {

        } while ();*/

        Integer capturas = 0;

            for (int i = 0; i < 16; i++) {
                capturas = (int)(Math.random()*16);
            }


    }
}
