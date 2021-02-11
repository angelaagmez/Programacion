package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class Atletismo extends Deporte {
    private int numpruebas;

    public Atletismo( String pabellon, int numpruebas) {
        super("Atletismo", pabellon);
        this.numpruebas = numpruebas;
    }

    public int getNumpruebas() {
        return numpruebas;
    }

    public void setNumpruebas(int numpruebas) {
        this.numpruebas = numpruebas;
    }

    public void addAtleta(Atletas atleta){
        addParticipante(atleta);
    }

    public void deleteAtleta(Atletas atleta){
        deleteParticipante(atleta.nombre);
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "numpruebas=" + numpruebas +
                ", nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
