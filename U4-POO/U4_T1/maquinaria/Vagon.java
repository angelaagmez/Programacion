package U4_T1.maquinaria;

public class Vagon {
    private int capacidad;
    private int carga;
    private String mercancia;

    public Vagon(int capacidad, int carga, String mercancia) {
        this.capacidad = capacidad;
        this.carga = carga;
        this.mercancia = mercancia;
    }

    public Vagon(int capacidad, String mercancia) {
        this(capacidad,0,mercancia);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "capacidad=" + capacidad +
                ", carga=" + carga +
                ", mercancia='" + mercancia + '\'' +
                '}';
    }
}
