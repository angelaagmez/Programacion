package U7_T2;

// Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen al segundo
// y false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:
//
//boolean incluido(Set conjunto1, Set conjunto2)

import java.util.HashSet;
import java.util.Set;

public class Actividad12 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        Set<Integer> conjunto3 = new HashSet<>();
        Set<Integer> conjunto4 = new HashSet<>();

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
        System.out.println("Contiene todos los elementos: "+incluido(conjunto1,conjunto2));

        conjunto3.add(1);
        conjunto3.add(4);
        conjunto3.add(3);
        conjunto3.add(7);

        conjunto4.add(7);
        conjunto4.add(3);
        conjunto4.add(4);
        conjunto4.add(1);

        System.out.println("Conjunto 3: "+conjunto3);
        System.out.println("Conjunto 4: "+conjunto4);
        System.out.println("Contiene todos los elementos: "+incluido(conjunto3,conjunto4));

    }

    public static boolean incluido(Set conjunto1, Set conjunto2){
        Set resultado = new HashSet(conjunto1);
        return resultado.containsAll(conjunto2);
    }
}
