package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class Judo extends Deporte{
    private int numtatamis;

    public Judo(String pabellon, int numtatamis) {
        super("Judo", pabellon);
        this.numtatamis = numtatamis;
    }

    public int getNumtatamis() {
        return numtatamis;
    }

    public void setNumtatamis(int numtatamis) {
        this.numtatamis = numtatamis;
    }

    public void addJudoka(Judokas judoka){
        addParticipante(judoka);
    }

    public void deleteJudoka(Judokas judoka){
        deleteParticipante(judoka.nombre);
    }

    @Override
    public String toString() {
        return "Judo{" +
                "numtatamis=" + numtatamis +
                ", nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
