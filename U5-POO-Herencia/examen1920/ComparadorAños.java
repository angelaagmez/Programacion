package U5.examen1920;

import java.util.Comparator;

public class ComparadorAños implements Comparator<Terrrestre> {
    @Override
    public int compare(Terrrestre o1, Terrrestre o2) {
        return o1.getAnyoMatriculacion()-o2.getAnyoMatriculacion();
    }
}
