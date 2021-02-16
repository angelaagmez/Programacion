package examen_U4U5;

public abstract class Vehiculos{
    protected String matricula;
    protected int cargaMax;
    protected Conductor conductor;

    public Vehiculos(String matricula, int cargaMax, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar();

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", cargaMax=" + cargaMax +
                ", conductor=" + conductor +
                '}';
    }

}
