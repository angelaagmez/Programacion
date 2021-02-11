package U5.libro;

public abstract class Vehiculo {
    static int vehiculosCreados = 0;
    static double kilometrosTotales = 0;
    protected double kilometrosRecorridos;

    public Vehiculo(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
        kilometrosTotales += kilometrosRecorridos;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(double kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vehiculosCreados=" + vehiculosCreados +
                ", kilometrosTotales=" + kilometrosTotales +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}
