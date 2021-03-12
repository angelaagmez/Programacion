package U7_T5;

import java.util.HashMap;

public class IntroducirAspirantes extends Aspirante{
    private int numIdentificativo=0;


    public IntroducirAspirantes(String nombre, String dni, String tlf, Integer numIdentificativo) {
        super(nombre, dni, tlf);
        numIdentificativo++;
    }

    public void insertaAspirante(String nombre, String dni, String tlf){

    }
}
