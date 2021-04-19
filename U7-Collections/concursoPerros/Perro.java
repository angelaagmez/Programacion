package concursoPerros;

public class Perro {
    private String nombre;
    private int edad;
    private double peso;
    private boolean tieneVacuna;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean tieneVacuna, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tieneVacuna = tieneVacuna;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneVacuna() {
        return tieneVacuna;
    }

    public void setTieneVacuna(boolean tieneVacuna) {
        this.tieneVacuna = tieneVacuna;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tieneVacuna=" + tieneVacuna +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }
}
