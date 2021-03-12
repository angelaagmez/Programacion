package U7_T2;

// Diseñar un método que devuelva la diferencia de dos conjuntos
// (elementos que pertenecen al primero, pero no al segundo). Con el prototipo:
//
//Set diferencia (Set conjunto1, Set conjunto2)

import java.util.HashSet;
import java.util.Set;

public class Actividad11 {
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
            System.out.println("Diferencia: "+diferencia(conjunto1,conjunto2));

        }

        public static Set diferencia(Set conjunto1, Set conjunto2){
            Set resultado = new HashSet(conjunto1);
            resultado.removeAll(conjunto2);
            return resultado;
        }
    }

