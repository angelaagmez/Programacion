package practicar;

import java.util.Comparator;

public class Osos extends Animales implements Comparator<Osos> {
    private double altura;
    private String colorPelaje;

    public Osos(int peso, String nombre, double altura, String colorPelaje) {
        super(peso, nombre);
        this.altura = altura;
        this.colorPelaje = colorPelaje;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return "Osos{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", colorPelaje='" + colorPelaje + '\'' +
                '}';
    }

    @Override
    public int compare(Osos o1, Osos o2) {
        return (int)(o1.altura-o2.getAltura());
    }
}
