package examen_U4U5;

import java.util.Arrays;

public class CamionCajas extends Vehiculos implements Comparable<CamionCajas>{
    private Cajas[] cajas;
    private int cont=0;

    public CamionCajas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.cajas = new Cajas[0];
    }

    public Cajas[] getCajas() {
        return cajas;
    }

    public void setCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void addCajas(Cajas c){
        if (cajas.length<cargaMax){
            cajas = Arrays.copyOf(cajas,cajas.length+1);
            cajas[cajas.length-1] = c;
            cont++;
        }
    }

    public void deleteCajas(String id){
        Cajas[] cajas2 = new Cajas[0];
        for (int i = 0; i < cajas.length; i++) {
            if (!id.equalsIgnoreCase(cajas[i].getId())){
                cajas2 = Arrays.copyOf(cajas2,cajas2.length+1);
                cajas2[cajas2.length-1] = cajas[i];
            }
        }
        cajas = cajas2;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando "+cont+" cajas y "+cont*5+" prendas");
    }


    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                ", matricula='" + matricula + '\'' +
                ", cargaMax=" + cargaMax +
                ", conductor=" + conductor +
                ", nºcajas=" +cont+
                '}';
    }


    @Override
    public int compareTo(CamionCajas o) {
        return this.cont-o.cont;
    }
}
