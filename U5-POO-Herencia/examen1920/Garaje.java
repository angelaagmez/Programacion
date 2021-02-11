package U5.examen1920;

import U5.libro.Vehiculo;

import java.util.Arrays;

public class Garaje {
    Vehiculos[] v;

    public Garaje(Vehiculos[] v) {
        this.v = v;
    }

    public Vehiculos[] getV() {
        return v;
    }

    public void setV(Vehiculos[] v) {
        this.v = v;
    }

    public void addVehiculos(Vehiculos vehiculo){
        v = Arrays.copyOf(v,v.length+1);
        v[v.length-1] = vehiculo;
    }

    public void deleteVehiculos(String nombre) {
        Vehiculos[] vehiculos2 = new Vehiculos[0];

        for (int i = 0; i < v.length; i++) {
            if (!nombre.equalsIgnoreCase(v[i].nombre)) {
                vehiculos2 = Arrays.copyOf(vehiculos2,vehiculos2.length+1);
                vehiculos2[vehiculos2.length-1] = v[i];
            }
            v = vehiculos2;
            
        }
    }

    @Override
    public String toString() {
        return "Garaje { " +
                " Vehiculos =" + Arrays.toString(v) +
                '}';
    }
}
