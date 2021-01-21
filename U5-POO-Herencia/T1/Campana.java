package U5.T1;

import java.util.Arrays;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("SOY UNA CAMPANA");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(Arrays.toString(notas));
        }
    }
}
