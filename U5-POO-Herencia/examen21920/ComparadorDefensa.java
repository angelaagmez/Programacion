package U5.examen21920;

import java.util.Comparator;

public class ComparadorDefensa implements Comparator<Personajes> {
    @Override
    public int compare(Personajes o1, Personajes o2) {
        return o2.defensa-o1.defensa;
    }
}
