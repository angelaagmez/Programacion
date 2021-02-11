package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class Edicion {
    private int year;
    private String sede;
    private Pais[] paises;
    private Deporte[] deportes;

    public Edicion(int year, String sede) {
        while (year%4!=0){
            year++;
        }
        this.year = year;
        this.sede = sede;
        this.paises = new Pais[0];
        this.deportes = new Deporte[0];
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year%4==0){
            this.year = year;
        } else {
            System.out.println("El año debe ser multiplo de 4");
        }

    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public void addPaises(Pais pais){
        paises = Arrays.copyOf(paises,paises.length+1);
        paises[paises.length-1] = pais;
    }

    public void deletePais(String nombre){
        Pais[] paises2 = new Pais[0];

        for (int i = 0; i < paises.length; i++) {
            if (!nombre.equalsIgnoreCase(paises[i].getNombre())){
                paises2 = Arrays.copyOf(paises2,paises2.length+1);
                paises2[paises2.length-1] = paises[i];
            }
        }
        paises = paises2;
    }

    public void addDeportes(Deporte deporte){
        deportes = Arrays.copyOf(deportes,deportes.length+1);
        deportes[deportes.length-1] = deporte;
    }

    public void deleteDeporte(String nombre){
        Deporte[] deportes2 = new Deporte[0];

        for (int i = 0; i < deportes.length; i++) {
            if (!nombre.equalsIgnoreCase(deportes[i].getNombre())){
                deportes2 = Arrays.copyOf(deportes2,deportes2.length+1);
                deportes2[deportes2.length-1] = deportes[i];
            }
        }
        deportes = deportes2;
    }

    public void mostrarPaises(){
        Arrays.sort(paises);
        System.out.println(Arrays.toString(paises));
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises, new OrdenarPaisxNombre());
        System.out.println(Arrays.toString(paises));
    }

    @Override
    public String toString() {
        return "Edicion{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}
