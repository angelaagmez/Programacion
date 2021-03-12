package examen_collections;


import java.util.Objects;

public class Medicion {
    private int temperatura;
    private int humedad;
    private int presion;

    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicion medicion = (Medicion) o;
        return temperatura == medicion.temperatura && humedad == medicion.humedad && presion == medicion.presion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, humedad, presion);
    }

    @Override
    public String toString() {
        return "Medicion{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }
}