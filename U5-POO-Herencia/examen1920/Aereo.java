package U5.examen1920;

public abstract class Aereo extends Vehiculos{
    protected double altitud;
    protected String oaci;

    public Aereo(String nombre, Integer cantMaxima, double altitud, String oaci) {
        super(nombre, cantMaxima);
        this.altitud = altitud;
        this.oaci = oaci;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public String getOaci() {
        return oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }

    public abstract String volar();


    @Override
    public String toString() {
        return "Aereo{" +
                "altitud=" + altitud +
                ", oaci='" + oaci + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                ", cantMaxima=" + cantMaxima +
                '}';
    }
}
