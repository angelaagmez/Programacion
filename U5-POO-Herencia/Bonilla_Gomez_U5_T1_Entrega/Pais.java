package Bonilla_Gomez_U5_T1_Entrega;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private int participantes;

    public Pais(String nombre, int participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", participantes=" + participantes +
                '}';
    }


    @Override
    public int compareTo(Pais o) {
        return o.participantes-this.participantes;
    }

}
