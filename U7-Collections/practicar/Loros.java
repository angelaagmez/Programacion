package practicar;

import java.util.Comparator;

public class Loros extends Animales implements Comparator<Loros> {
    private String colorPlumas;
    private boolean hablar;

    public Loros(int peso, String nombre, String colorPlumas, boolean hablar) {
        super(peso, nombre);
        this.colorPlumas = colorPlumas;
        this.hablar = hablar;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public boolean isHablar() {
        return hablar;
    }

    public void setHablar(boolean hablar) {
        this.hablar = hablar;
    }

    @Override
    public String toString() {
        return "Loros{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", colorPlumas='" + colorPlumas + '\'' +
                ", hablar=" + hablar +
                '}';
    }

    @Override
    public int compare(Loros o1, Loros o2) {
        return o1.colorPlumas.compareToIgnoreCase(o2.getColorPlumas());
    }
}
