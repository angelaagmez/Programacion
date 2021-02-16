package examen_U4U5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fara {
    CamionCajas[] camionCajas;
    CamionPerchas[] camionPerchas;

    public Fara() {
        this.camionCajas = new CamionCajas[0];
        this.camionPerchas = new CamionPerchas[0];
    }

    public CamionCajas[] getCamionCajas() {
        return camionCajas;
    }

    public void setCamionCajas(CamionCajas[] camionCajas) {
        this.camionCajas = camionCajas;
    }

    public CamionPerchas[] getCamionPerchas() {
        return camionPerchas;
    }

    public void setCamionPerchas(CamionPerchas[] camionPerchas) {
        this.camionPerchas = camionPerchas;
    }

    public void addCamionCajas(CamionCajas c){
        camionCajas = Arrays.copyOf(camionCajas,camionCajas.length+1);
        camionCajas[camionCajas.length-1] = c;
    }

    public void deleteVehiculos(String matricula){
        CamionCajas[] camionCajas2 = new CamionCajas[0];
        for (int i = 0; i < camionCajas.length; i++) {
            if (!matricula.equalsIgnoreCase(camionCajas[i].getMatricula())) {
                camionCajas2 = Arrays.copyOf(camionCajas2,camionCajas2.length+1);
                camionCajas2[camionCajas2.length-1] = camionCajas[i];
            }
        }
        camionCajas = camionCajas2;
    }

    public void addCamionPerchas(CamionPerchas c){
        camionPerchas = Arrays.copyOf(camionPerchas,camionPerchas.length+1);
        camionPerchas[camionPerchas.length-1] = c;
    }

    public void deleteCamionPerchas(String matricula){
        CamionPerchas[] camionPerchas2 = new CamionPerchas[0];
        for (int i = 0; i < camionPerchas.length; i++) {
            if (!matricula.equalsIgnoreCase(camionPerchas[i].getMatricula())) {
                camionPerchas2 = Arrays.copyOf(camionPerchas2,camionPerchas2.length+1);
                camionPerchas2[camionPerchas2.length-1] = camionPerchas[i];
            }
        }
        camionPerchas = camionPerchas2;
    }

    public void mostrarxCajas(){
        Arrays.sort(camionCajas);
        System.out.println(Arrays.toString(camionCajas));
    }

    public void mostrarxPeso(){
        Arrays.sort(camionCajas,new CompararxPeso());
        System.out.println(Arrays.toString(camionCajas));
    }

    public void mostrarxPrendas(){
        Arrays.sort(camionPerchas);
        System.out.println(Arrays.toString(camionPerchas));
    }

    @Override
    public String toString() {
        return "Flota{" +
                "camionCajas=" + Arrays.toString(camionCajas) +
                ", camionPerchas=" + Arrays.toString(camionPerchas) +
                '}';
    }
}
