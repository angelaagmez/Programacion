package coronavirus;

public class Pacientes {
    private String nombre;
    private int edad;
    private double peso;
    private boolean tieneVacuna;
    private Medicos medico;
    private String cepa;

    public Pacientes(String nombre, int edad, double peso, boolean tieneVacuna, Medicos medico, String cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tieneVacuna = tieneVacuna;
        this.medico = medico;
        this.cepa = cepa;
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

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public String getCepa() {
        return cepa;
    }

    public void setCepa(String cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tieneVacuna=" + tieneVacuna +
                ", medico=" + medico +
                ", cepa='" + cepa + '\'' +
                '}';
    }
}
