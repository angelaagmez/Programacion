package practicar_U5;

import java.util.Arrays;

public class Granja {
    Animales[] animales;
    Personas[] personas;

    public Granja() {
        this.animales = new Animales[0];
        this.personas = new Personas[0];
    }

    public Animales[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animales[] animales) {
        this.animales = animales;
    }

    public Personas[] getPersonas() {
        return personas;
    }

    public void setPersonas(Personas[] personas) {
        this.personas = personas;
    }

    public void addAnimales(Animales animal){
        animales = Arrays.copyOf(animales,animales.length+1);
        animales[animales.length-1] = animal;
    }

    public void deleteAnimales(String nombre){
        Animales[] animales2 = new Animales[0];
        for (int i = 0; i < animales.length; i++) {
            if (!nombre.equalsIgnoreCase(animales[i].getNombre())){
                animales2 = Arrays.copyOf(animales2,animales2.length+1);
                animales2[animales2.length-1] = animales[i];
            }
        }
        animales = animales2;
    }

    public void addPersonas(Personas persona){
        personas = Arrays.copyOf(personas,personas.length+1);
        personas[personas.length-1] = persona;
    }

    public void deletePersonas(String dni){
        Personas[] personas2 = new Personas[0];
        for (int i = 0; i < personas.length; i++) {
            if (!dni.equalsIgnoreCase(personas[i].getDni())){
                personas2 = Arrays.copyOf(personas2,personas2.length+1);
                personas2[personas2.length-1] = personas[i];
            }
        }
        personas = personas2;
    }

    public void ordenarxCalidad(){
        Arrays.sort(animales,new CompararxCalidad());
        System.out.println(Arrays.toString(animales));
    }

    public void ordenarxEdad(){
        Arrays.sort(personas,new CompararxEdad());
        System.out.println(Arrays.toString(personas));
    }
    

    @Override
    public String toString() {
        return "Granja{" +
                "animales=" + Arrays.toString(animales) +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }
}
