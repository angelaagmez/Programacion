package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Comparator;

public class OrdenarPaisxNombre implements Comparator<Pais> {
    @Override
    public int compare(Pais o1, Pais o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}
