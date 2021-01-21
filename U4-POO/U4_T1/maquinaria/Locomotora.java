package U4_T1.maquinaria;

import U4_T1.personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anoFabricacion;
    private Mecanico mec;

    public Locomotora(String matricula, int potencia, int anoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mec = mec;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Mecanico getMec() {
        return mec;
    }

    public void setMec(Mecanico mec) {
        this.mec = mec;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anoFabricacion=" + anoFabricacion +
                ", mec=" + mec +
                '}';
    }
}
