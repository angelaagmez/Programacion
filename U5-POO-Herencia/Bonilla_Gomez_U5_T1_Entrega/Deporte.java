package Bonilla_Gomez_U5_T1_Entrega;

import U5.examen1920.Comparable;

import java.util.Arrays;

public abstract class Deporte {
    protected String nombre;
    protected String pabellon;
    protected Participante[] participantes;

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.participantes = new Participante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    protected void addParticipante(Participante participante){
        participantes = Arrays.copyOf(participantes,participantes.length+1);
        participantes[participantes.length-1] = participante;
    }

    protected void deleteParticipante(String nombre){
        Participante[] participantes2 = new Participante[0];

        for (int i = 0; i < participantes.length; i++) {
            if (!nombre.equalsIgnoreCase(participantes[i].getNombre())){
                participantes2 = Arrays.copyOf(participantes2,participantes2.length+1);
                participantes2[participantes2.length-1] = participantes[i];
            }
        }
        participantes = participantes2;
    }

    public void mostrarParticipantes(){
        Arrays.sort(participantes);
        System.out.println(Arrays.toString(participantes));
    }

    public void mostrarJugadoresBaloncestPorAltura(){
        Arrays.sort(participantes,new OrdenarBaloncestoxAltura());
        System.out.println(Arrays.toString(participantes));
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
