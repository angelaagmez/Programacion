package libro;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ej3_carrito {
    private ArrayList listaElementos;

    public Ej3_carrito() {
        this.listaElementos = new ArrayList<Ej3_elementos>();
    }

    public ArrayList getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList listaElementos) {
        this.listaElementos = listaElementos;
    }

    @Override
    public String toString() {
        return "Ej3_carrito{" +
                "listaElementos=" + listaElementos +
                '}';
    }
}
