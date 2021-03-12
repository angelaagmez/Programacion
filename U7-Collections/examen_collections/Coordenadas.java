package examen_collections;

public class Coordenadas {
    private int latitud;
    private int longitud;

    public Coordenadas(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
