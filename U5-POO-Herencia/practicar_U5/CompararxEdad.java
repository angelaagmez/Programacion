package practicar_U5;

import java.util.Comparator;

public class CompararxEdad implements Comparator<Personas> {
    @Override
    public int compare(Personas o1, Personas o2) {
        return o2.getEdad()-o1.getEdad();
    }
}
