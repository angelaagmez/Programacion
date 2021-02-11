package U5.examen1920;

import java.util.Comparator;

public class ComparadorVehiculos implements Comparator<Vehiculos> {

    @Override
    public int compare(Vehiculos o1, Vehiculos o2) {

        if (o1 instanceof Terrrestre){
            if (o2 instanceof Terrrestre){
                return ((Terrrestre) o1).matricula.compareToIgnoreCase(((Terrrestre) o2).matricula);
            } else {
                return ((Terrrestre) o1).matricula.compareToIgnoreCase(((Aereo) o2).oaci);
            }
        } else {
            if (o2 instanceof Aereo){
                return ((Aereo) o1).oaci.compareToIgnoreCase(((Aereo) o2).oaci);
            } else {
                return ((Aereo) o1).oaci.compareToIgnoreCase(((Terrrestre) o2).matricula);
            }
        }

    }
}
