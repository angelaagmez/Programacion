package practicar_U5;

public abstract class Ganado extends Animales {
    String identificador;
    int calidad;

    public Ganado(String nombre, int peso, String identificador, int calidad) {
        super(nombre, peso);
        this.identificador = identificador;
        this.calidad = calidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return "Ganado{" +
                "identificador='" + identificador + '\'' +
                ", calidad='" + calidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
