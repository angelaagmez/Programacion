package Bonilla_Gomez_U5_T1_Entrega;

import java.lang.management.CompilationMXBean;
import java.util.Comparator;


public class OrdenarBaloncestoxAltura implements Comparator<Participante> {
    @Override
    public int compare(Participante o1, Participante o2) {
        return (int) (((JugadorBaloncesto) o1).getAltura()-((JugadorBaloncesto) o2).getAltura());
    }
}
