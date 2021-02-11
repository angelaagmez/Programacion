package U5.libro;

public class Coche extends Vehiculo{
    public Coche(double kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void andarCoche(double km){
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }

    public void quemarRueda(){
        System.out.println("Quema rueda");
        kilometrosTotales += 3;
        kilometrosRecorridos += 3;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}
