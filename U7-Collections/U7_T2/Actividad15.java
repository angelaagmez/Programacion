package U7_T2;

// Definir una clase ListaOrdenada, que hereda de LinkedList, que permita la inserción ordenada. Codificar un método
// que inserte un nuevo elemento con el prototipo:
//
//void insertarOrdenado( E elemento)

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Actividad15 extends LinkedList{
    List l1;

    public Actividad15() {
        this.l1  = new LinkedList();
    }

    public List getL1() {
        return l1;
    }

    public void setL1(List l1) {
        this.l1 = l1;
    }

    public <E> void insertarOrdenado(E elemento){
        l1.add(elemento);
        Collections.sort(l1);
    }

    @Override
    public String toString() {
        return "Lista = " + l1;
    }

    public static void main(String[] args) {
        Actividad15 lista = new Actividad15();
         lista.insertarOrdenado(12);
         lista.insertarOrdenado(7);
         lista.insertarOrdenado(10);
         lista.insertarOrdenado(5);
         lista.insertarOrdenado(2);
         lista.insertarOrdenado(1);
         lista.insertarOrdenado(6);

        System.out.println(lista);
    }
}
