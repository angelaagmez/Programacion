package Bonilla_Gomez_U4_T1_Entrega;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] d;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.d = new Departamento[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getD() {
        return d;
    }

    public void setD(Departamento[] d) {
        this.d = d;
    }

    public void addDepartamento(Departamento dep){
        d = Arrays.copyOf(d,d.length+1);
        d[d.length-1] = dep;
    }

    public void mostrarInfoDepartamentos(){
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
