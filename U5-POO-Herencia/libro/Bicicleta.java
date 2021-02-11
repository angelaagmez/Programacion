package U5.libro;

public class Bicicleta extends Vehiculo {
    public Bicicleta(double kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void andarBici(double km){
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }

    public void hacerCaballito(){
        System.out.println("Hacer caballito");
        kilometrosTotales += 2;
        kilometrosRecorridos += 2;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}
