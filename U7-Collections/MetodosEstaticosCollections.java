import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodosEstaticosCollections {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();


        list.add(5);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        System.out.println(Collections.binarySearch(list,12));      // Nos dice en que posicion esta
        System.out.println(Collections.binarySearch(list,2));

        Collections.swap(list,4,1);   // intercambiamos posiciones
        System.out.println(list);

        Collections.replaceAll(list,1,100);   // Reemplazar elementos
        System.out.println(list);

        Collections.fill(list,500);   // Rellena todo
        System.out.println(list);

        List list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(1);
        list2.add(3);
        Collections.copy(list2,list);
        System.out.println(list2);

        System.out.println(Collections.frequency(list,500));  // Cuantas veces se repite
    }
}
