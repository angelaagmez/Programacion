package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class JuegosDeportivosMundiales {
    private Edicion[] ediciones;

    public JuegosDeportivosMundiales() {
        this.ediciones = new Edicion[0];
    }

    public Edicion[] getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(Edicion[] ediciones) {
        this.ediciones = ediciones;
    }

    public void addEdiciones(Edicion edicion){
        ediciones = Arrays.copyOf(ediciones,ediciones.length+1);
        ediciones[ediciones.length-1] = edicion;
    }

    public void deleteEdiciones(int year){
        Edicion[] ediciones2 = new Edicion[0];
        for (int i = 0; i < ediciones.length; i++) {
            if (year!=ediciones[i].getYear()){
                ediciones2 = Arrays.copyOf(ediciones,ediciones2.length+1);
                ediciones2[ediciones2.length-1] = ediciones[i];
            }
        }
        ediciones = ediciones2;
    }

    @Override
    public String toString() {
        return "JuegosDeportivosMundiales{" +
                "ediciones=" + Arrays.toString(ediciones) +
                '}';
    }
}
