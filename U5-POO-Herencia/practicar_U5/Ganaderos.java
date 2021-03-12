package practicar_U5;

import java.util.Arrays;

public class Ganaderos extends Personas {
    int idGanadero;
    Animales[] animales;

    public Ganaderos(String nombre, String dni, int edad, int idGanadero) {
        super(nombre, dni, edad);
        this.idGanadero = idGanadero;
        this.animales = new Animales[0];
    }

    public int getIdGanadero() {
        return idGanadero;
    }

    public void setIdGanadero(int idGanadero) {
        this.idGanadero = idGanadero;
    }

    public Animales[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animales[] animales) {
        this.animales = animales;
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

    @Override
    public String toString() {
        return "Ganaderos{" +
                "idGanadero=" + idGanadero +
                ", animales=" + Arrays.toString(animales) +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
