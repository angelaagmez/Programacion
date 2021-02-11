package U5.ejemplo_interfaces;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Profesor p = new Profesor("Pepe","Perez","DAW","BD");
        Alumno a = new Alumno("Lola","Flores", Calendar.getInstance());

        a.lanzarJuramento();
        a.gritoSordo();

        System.out.println(Gritar.coletilla);

        System.out.println(Persona.getNumInstancias());
    }
}
