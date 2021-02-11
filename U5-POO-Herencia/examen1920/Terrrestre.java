package U5.examen1920;

import java.util.Objects;

public abstract class Terrrestre extends Vehiculos implements Comparable{
    protected String matricula;
    protected Integer anyoMatriculacion;
    protected Color color;

    public Terrrestre(String nombre, Integer cantMaxima, String matricula, Integer anyoMatriculacion, Color color) {
        super(nombre, cantMaxima);
        this.matricula = matricula;
        this.anyoMatriculacion = anyoMatriculacion;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getAnyoMatriculacion() {
        return anyoMatriculacion;
    }

    public void setAnyoMatriculacion(Integer anyoMatriculacion) {
        this.anyoMatriculacion = anyoMatriculacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrrestre that = (Terrrestre) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Terrrestre{" +
                "matricula='" + matricula + '\'' +
                ", añoMatriculacion=" + anyoMatriculacion +
                ", color=" + color +
                ", nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                '}';
    }
}
