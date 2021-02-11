package U5.ejercicio_adicional;

import java.util.Comparator;

public class ComparadorQuemar implements Comparator<Materiales> {

    @Override
    public int compare(Materiales o1, Materiales o2) {
        return o2.quemar-o1.quemar;
    }
}
