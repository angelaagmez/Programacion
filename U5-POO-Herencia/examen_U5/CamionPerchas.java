package examen_U4U5;

import java.util.Arrays;

public class CamionPerchas extends Vehiculos implements Comparable<CamionPerchas>{
    private Prendas[] prendaColgada;
    private int cont=0;

    public CamionPerchas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.prendaColgada = new Prendas[0];
    }

    public Prendas[] getPrendaColgada() {
        return prendaColgada;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void setPrendaColgada(Prendas[] prendaColgada) {
        this.prendaColgada = prendaColgada;
    }

    public void addPrendas(Prendas prenda){
        if (prendaColgada.length<cargaMax){
            prendaColgada = Arrays.copyOf(prendaColgada,prendaColgada.length+1);
            prendaColgada[prendaColgada.length-1] = prenda;
            cont++;
        }
    }


    public void deletePrendas(int codigo){
        Prendas[] prendas = new Prendas[0];
        for (int i = 0; i < prendaColgada.length; i++) {
            if (codigo!=prendaColgada[i].getCodigo()){
                prendas = Arrays.copyOf(prendas,prendas.length+1);
                prendas[prendas.length-1] = prendaColgada[i];
            }
        }
        prendaColgada = prendas;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando "+cont+" prendas");
    }



    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendaColgada=" + Arrays.toString(prendaColgada) +
                '}';
    }

    @Override
    public int compareTo(CamionPerchas o) {
        return this.cont-o.cont;
    }
}
