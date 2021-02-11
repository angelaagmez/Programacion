package U5.examen21920;

import java.util.Comparator;

public class ComparadorAtaque implements Comparator<Personajes> {
    @Override
    public int compare(Personajes o1, Personajes o2) {
        return o2.ataque-o1.ataque;
    }
}
