package U4_T1.libro;

import java.util.Arrays;

public class Frontera {
    Persona[] p;

    public Frontera() {
        this.p = new Persona[0];
    }


    public void datosPasoFrontera(String nombre, String dni){
        Persona p1 = new Persona(nombre, dni);

        p = Arrays.copyOf(p, p.length+1);
        p[p.length-1] = p1;

        System.out.println(p1);
    }

    public void pasoFronteraPersonas(Persona p1){

        p = Arrays.copyOf(p, p.length+1);
        p[p.length-1] = p1;

        System.out.println(p1);
    }

    public void informacionPersonasFrontera(){
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public void busquedaNombre(String nombre){
        for (int i = 0; i < p.length; i++) {
            if (nombre.equalsIgnoreCase(p[i].getNombre())){
                System.out.println(p[i]);
            }
        }
    }

    public void busquedaDni(String dni){
        for (int i = 0; i < p.length; i++) {
            if (dni.equalsIgnoreCase(p[i].getDni())){
                System.out.println(p[i]);
            }
        }
    }

    /*
    public void salirFrontera(String dni){
        Persona aux = new Persona();
    }
     */



}
