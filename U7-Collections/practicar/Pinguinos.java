package practicar;

import java.util.Comparator;

public class Pinguinos extends Animales implements Comparator<Pinguinos> {
    private boolean emperador;
    private double longitugPico;

    public Pinguinos(int peso, String nombre, boolean emperador, double longitugPico) {
        super(peso, nombre);
        this.emperador = emperador;
        this.longitugPico = longitugPico;
    }

    public boolean isEmperador() {
        return emperador;
    }

    public void setEmperador(boolean emperador) {
        this.emperador = emperador;
    }

    public double getLongitugPico() {
        return longitugPico;
    }

    public void setLongitugPico(double longitugPico) {
        this.longitugPico = longitugPico;
    }

    @Override
    public String toString() {
        return "Pinguinos{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", emperador=" + emperador +
                ", longitugPico=" + longitugPico +
                '}';
    }

    @Override
    public int compare(Pinguinos o1, Pinguinos o2) {
        return (int)(o1.longitugPico-o2.longitugPico);
    }
}
