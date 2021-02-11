package U5.T2;

import java.util.Comparator;

public class ComparadorEdades implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getEdad()-o2.getEdad();
    }
}
