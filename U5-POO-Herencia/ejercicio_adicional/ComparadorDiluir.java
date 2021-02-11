package U5.ejercicio_adicional;

import java.util.Comparator;

public class ComparadorDiluir implements Comparator<Materiales> {
    @Override
    public int compare(Materiales o1, Materiales o2) {
        return o2.diluir-o1.diluir;
    }
}
