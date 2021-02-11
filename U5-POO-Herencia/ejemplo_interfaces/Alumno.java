package U5.ejemplo_interfaces;

import java.util.Calendar;

public class Alumno extends Persona implements Gritar{
    Calendar fechaNacimiento;

    public Alumno(String nombre, String apellidos, Calendar fechaNacimiento) {
        super(nombre, apellidos);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void saludar() {
        System.out.println("Killo k pasa");
    }


    @Override
    public void lanzarJuramento() {
        System.out.println("XXXXXXX");
    }

    @Override
    public void gritoSordo() {
        System.out.println("AAAAHHHH");
    }
}
