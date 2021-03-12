package practicar_U5;

import java.util.Comparator;

public class CompararxCalidad implements Comparator<Animales> {

    @Override
    public int compare(Animales o1, Animales o2) {
        return (((Ganado) o1).getCalidad()-((Ganado) o2).getCalidad());
    }
}
