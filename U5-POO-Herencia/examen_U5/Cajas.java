package examen_U4U5;

import java.util.Arrays;

public class Cajas {
    private int capMax;
    private String id;
    private Prendas[] prendas;
    private int cont=0;
    private int peso=0;

    public Cajas(String id) {
        this.capMax = 5;
        this.id = id;
        this.prendas = new Prendas[0];
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prendas[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prendas[] prendas) {
        this.prendas = prendas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void addPrendas(Prendas p){
        if (prendas.length<capMax){
            prendas = Arrays.copyOf(prendas,prendas.length+1);
            prendas[prendas.length-1] = p;
            cont++;
            peso+=p.getPeso();
        }

    }

    public void deletePrendas(int codigo){
        Prendas[] prendas2 = new Prendas[0];
        for (int i = 0; i < prendas.length; i++) {
            if (codigo!=prendas[i].getCodigo()){
                prendas2 = Arrays.copyOf(prendas2,prendas2.length+1);
                prendas2[prendas2.length-1] = prendas[i];
            }
        }
        prendas = prendas2;
    }


    @Override
    public String toString() {
        return "Cajas{" +
                "capMax=" + capMax +
                ", id='" + id + '\'' +
                ", prendas=" + Arrays.toString(prendas) +
                ", nº prendas=" + cont +
                ", pesoTotalCaja="+peso+
                '}';
    }
}
