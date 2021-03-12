package U7_T2;

//  Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que
//  pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
//
//Set union (Set conjunto1, Set conjunto2)

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        conjunto1.add(3);
        conjunto1.add(5);
        conjunto1.add(7);
        conjunto1.add(9);

        conjunto2.add(3);
        conjunto2.add(9);
        conjunto2.add(6);
        conjunto2.add(8);

        System.out.println("Conjunto 1: "+conjunto1);
        System.out.println("Conjunto 2: "+conjunto2);
        System.out.println("Union: "+union(conjunto1,conjunto2));


    }
    
    public static Set union(Set conjunto1, Set conjunto2){
        Set resultado = new HashSet(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }
}
