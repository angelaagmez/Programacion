package Bonilla_Gomez_U4_T1_Entrega;


import java.util.Arrays;

public class Departamento {
    private String nombreDep;
    private String sede;
    private String tlf;
    private Empleado[] e;
    private static int contDepartamento=0;

    public Departamento(String nombreDep, String sede, String tlf) {
        this.nombreDep = nombreDep;
        this.sede = sede;
        this.tlf = tlf;
        this.e = new Empleado[0];
        contDepartamento++;
    }

    public Departamento(String nombreDep, String tlf) {
        this.nombreDep = nombreDep;
        this.sede = "Castilleja";
        this.tlf = tlf;
        this.e = new Empleado[0];
        contDepartamento++;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Empleado[] getE() {
        return e;
    }

    public void setE(Empleado[] e) {
        this.e = e;
    }

    public void addEmpleado(Empleado emp){
        e = Arrays.copyOf(e,e.length+1);
        e[e.length-1] = emp;
    }

    public void deleteEmpleado(String numss){
        Empleado[] noEliminados = new Empleado[0];
        for (int i = 0; i < e.length; i++) {
            if (!e[i].getNss().equals(numss)){
                noEliminados = Arrays.copyOf(noEliminados,noEliminados.length+1);
                noEliminados[noEliminados.length-1] = e[i];
            }
        }
        e = noEliminados;
    }

    public void mostrarInfoEmpleados(){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static int getContDepartamento() {
        return contDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDep='" + nombreDep + '\'' +
                ", sede='" + sede + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }


}
