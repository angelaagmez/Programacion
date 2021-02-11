package Bonilla_Gomez_U5_T1_Entrega;

import U5.examen1920.Terrrestre;

public abstract class Participante implements Comparable<Participante> {
    protected String nombre;
    protected int edad;

    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerjuramento();

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Participante o) {
        return this.edad-o.edad;
    }
}
