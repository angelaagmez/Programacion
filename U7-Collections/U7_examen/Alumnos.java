package Bonilla_Gomez_U7_entrega;

import java.io.Serializable;
import java.util.Objects;

public class Alumnos implements Serializable {
    private String nombre;
    private String apellidos;
    private String dni;
    private static int id;
    private String guardarId;
    private String unidad;

    public Alumnos(String nombre, String apellidos, String dni, String unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.guardarId = Integer.toString(id);
        this.unidad = unidad;
        id++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Alumnos.id = id;
    }

    public String getGuardarId() {
        return guardarId;
    }

    public void setGuardarId(String guardarId) {
        this.guardarId = guardarId;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return guardarId.equals(alumnos.guardarId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guardarId);
    }

    @Override
    public String toString() {
        return '\n'+"Alumnos{" +
                "nombre='" + nombre + '\n' +
                ", apellidos='" + apellidos + '\n' +
                ", dni='" + dni + '\n' +
                ", guardarId=" + guardarId + '\n' +
                ", unidad=" + unidad +
                '}'+'\n';
    }
}
