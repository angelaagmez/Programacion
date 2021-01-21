package U5.T1;

import java.util.Arrays;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("SOY UN PIANO");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(Arrays.toString(notas));
        }
    }
}
