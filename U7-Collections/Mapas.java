import java.util.*;

public class Mapas {
    public static void main(String[] args) {

        Map<String,String> diccionario = new TreeMap<String,String>();

        diccionario.put("mapa","estructura de datos bla bla");
        diccionario.put("acceso","estructura de datos bla bla");
        diccionario.put("collection","estructura de datos bla bla");

        String v = diccionario.remove("collection");
        System.out.println(diccionario);

        System.out.println(v);

        System.out.println(diccionario.get("mapa"));

        Set<String> conjuntoClaves = diccionario.keySet();
        System.out.println(conjuntoClaves);

        TreeSet<String> conjuntoClaves2 = new TreeSet<>(diccionario.keySet());
        System.out.println(conjuntoClaves2);

        Set<String> valores = new TreeSet<String>(diccionario.values());
        System.out.println(valores);
        // Para coger todos los valores usamos Collections, asi no perdemos los repetidos

        Set<Map.Entry<String,String>> entradas = diccionario.entrySet();
        System.out.println(entradas);  // Para mostrar sin perder las claves

        // Tres posibilidades para iterar
        // Primera con iterator:
        for (Iterator<Map.Entry<String,String>> it = entradas.iterator(); it.hasNext();) {
            Map.Entry<String,String> current = it.next();
            System.out.println("La clave es: "+current.getKey());
            System.out.println("El valor es: "+current.getValue());
        }

        // Segunda con iterator:
        Iterator<Map.Entry<String,String>> it = entradas.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> current = it.next();
            System.out.println("La clave es: "+current.getKey());
            System.out.println("El valor es: "+current.getValue());
        }

        // Tercera con foreach

    }
}
