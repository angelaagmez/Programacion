package practicar;

import java.util.Comparator;

public class Leones extends Animales implements Comparator<Leones> {
    private double longitudMelena;
    private boolean rugir;

    public Leones(int peso, String nombre, double longitudMelena, boolean rugir) {
        super(peso, nombre);
        this.longitudMelena = longitudMelena;
        this.rugir = rugir;
    }

    public double getLongitudMelena() {
        return longitudMelena;
    }

    public void setLongitudMelena(double longitudMelena) {
        this.longitudMelena = longitudMelena;
    }

    public boolean isRugir() {
        return rugir;
    }

    public void setRugir(boolean rugir) {
        this.rugir = rugir;
    }

    @Override
    public String toString() {
        return "Leones{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", longitudMelena=" + longitudMelena +
                ", rugir=" + rugir +
                '}';
    }

    @Override
    public int compare(Leones o1, Leones o2) {
        return (int) (o1.longitudMelena-o2.longitudMelena);
    }
}
