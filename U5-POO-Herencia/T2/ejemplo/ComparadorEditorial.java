package U5.T2.ejemplo;

import java.util.Comparator;

public class ComparadorEditorial implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getEditorial().compareToIgnoreCase(o2.getEditorial());
    }
}
