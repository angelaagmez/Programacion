package U5.examen1920;

public abstract class Vehiculos {
    protected String nombre;
    protected Integer numPersonas;
    protected Integer cantMaxima;

    public Vehiculos(String nombre, Integer cantMaxima) {
        this.nombre = nombre;
        this.numPersonas = 0;
        this.cantMaxima = cantMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Integer numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public void transportar(Integer personas){
        if (personas>cantMaxima){
            System.out.println("No se puede transportar a tantas personas en este vehiculo");
        } else {
            this.numPersonas += personas;
        }
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                '}';
    }
}
