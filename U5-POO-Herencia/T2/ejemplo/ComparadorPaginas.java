package U5.T2.ejemplo;

import java.util.Comparator;

public class ComparadorPaginas implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getPaginas()-o2.getPaginas();
    }
}
