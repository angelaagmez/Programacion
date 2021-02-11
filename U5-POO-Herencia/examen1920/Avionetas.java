package U5.examen1920;

public class Avionetas extends Aereo{
    public Avionetas(String nombre, double altitud, String oaci) {
        super(nombre, 7, altitud, oaci);
    }

    @Override
    public String volar() {
        return "Soy una avioneta y vuelo a "+altitud+" m de altura";
    }

    @Override
    public String toString() {
        return volar() + "Codigo OACI: " + oaci + " - Nº personas a bordo: " + numPersonas;
    }
}
