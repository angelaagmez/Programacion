package U5.examen1920;

public class Helicopteros extends Aereo{
    public Helicopteros(String nombre, double altitud, String oaci) {
        super(nombre, 10, altitud, oaci);
    }

    @Override
    public String volar() {
        return "Soy un helicoptero y vuelo a "+altitud+" m de altura";
    }

    @Override
    public String toString() {
        return volar() + " - Codigo OACI: " + oaci + " - Nº personas a bordo: " + numPersonas;
    }
}
