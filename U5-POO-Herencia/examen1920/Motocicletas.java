package U5.examen1920;

public class Motocicletas extends Terrrestre{
    public Motocicletas(String nombre, String matricula, Integer anyoMatriculacion, Color color) {
        super(nombre, 2, matricula, anyoMatriculacion, color);
    }

    @Override
    public String toString() {
        return "Motocicletas{" +
                "matricula='" + matricula + '\'' +
                ", anyoMatriculacion=" + anyoMatriculacion +
                ", color=" + color +
                ", nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                ", cantMaxima=" + cantMaxima +
                '}';
    }

    @Override
    public int compareTo(Terrrestre t) {
        return this.matricula.compareToIgnoreCase(t.matricula);
    }
}
