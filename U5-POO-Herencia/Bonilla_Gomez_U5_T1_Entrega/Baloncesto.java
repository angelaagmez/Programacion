package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class Baloncesto extends Deporte{
    private int numequipos;

    public Baloncesto(String pabellon, int numequipos) {
        super("Baloncesto", pabellon);
        this.numequipos = numequipos;
    }

    public int getNumequipos() {
        return numequipos;
    }

    public void setNumequipos(int numequipos) {
        this.numequipos = numequipos;
    }

    public void addJugadores(JugadorBaloncesto jugador){
        addParticipante(jugador);
    }

    public void deleteJugadores(JugadorBaloncesto jugador){
        deleteParticipante(jugador.nombre);
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "numequipos=" + numequipos +
                ", nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
