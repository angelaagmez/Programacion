package U5.examen1920;


public class Coches extends Terrrestre {
    public Coches(String nombre, String matricula, Integer anyoMatriculacion, Color color) {
        super(nombre, 5, matricula, anyoMatriculacion, color);
    }

    @Override
    public int compareTo(Terrrestre t) {
        return this.matricula.compareToIgnoreCase(t.matricula);
    }

    @Override
    public String toString() {
        return "Coches{" +
                "matricula='" + matricula + '\'' +
                ", anyoMatriculacion=" + anyoMatriculacion +
                ", color=" + color +
                ", nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                ", cantMaxima=" + cantMaxima +
                '}';
    }
}
