package U5.ejercicio_adicional;

import java.util.Arrays;

public class Minecraft {
    Materiales[] m;
    private int cantMax;

    public Minecraft() {
        this.m = new Materiales[0];
        this.cantMax = 10;
    }

    public Materiales[] getM() {
        return m;
    }

    public void setM(Materiales[] m) {
        this.m = m;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public void addMateriales(Materiales material){
        if (m.length>=cantMax){
            System.out.println("Ha alcanzado el maximo de materiales que puede añadir");
        } else {
            m = Arrays.copyOf(m,m.length+1);
            m[m.length-1] = material;
        }
    }

    public void borrarMaterialSinMasa(){
        Materiales[] conMasa = new Materiales[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i].masa>0){
                conMasa = Arrays.copyOf(conMasa,conMasa.length+1);
                conMasa[conMasa.length-1] = m[i];
            }
        }
        m = conMasa;
    }

    public void mostrarEstado(){
        System.out.println(Arrays.toString(m));
    }

    public void mostrarxQuemar(){
        Arrays.sort(m, new ComparadorQuemar());
        System.out.println(Arrays.toString(m));
    }

    public void mostrarxDiluir(){
        Arrays.sort(m, new ComparadorDiluir());
        System.out.println(Arrays.toString(m));
    }

    public void ultimoMaterialQueQueda(){
        if (m.length==1){
            System.out.println("QUEDA UNO");
            System.out.println(m[0]);

        }
    }

    @Override
    public String toString() {
        return "Minecraft{" +
                "m=" + Arrays.toString(m) +
                '}';
    }
}
