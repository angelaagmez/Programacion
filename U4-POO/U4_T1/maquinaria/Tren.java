package U4_T1.maquinaria;

import U4_T1.personal.Maquinista;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Maquinista maquinista;
    private Vagon vagones[];
    static final int capacidad = 5;

    public Tren(Locomotora locomotora, Maquinista maquinista, Vagon[] vagones) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;

        if (vagones.length<=Tren.capacidad){
            this.vagones = vagones;
        } else {
            vagones = new Vagon[0];
        }

    }

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this(locomotora,maquinista,new Vagon[0]);
    }

    public boolean addVagon(Vagon v) {
        if (this.vagones.length<5){
            this.vagones = Arrays.copyOf(this.vagones,this.vagones.length+1);
            this.vagones[this.vagones.length-1] = v;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeVagon() {
        if (this.vagones.length>0) {
            this.vagones = Arrays.copyOf(this.vagones, this.vagones.length-1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", maquinista=" + maquinista +
                ", vagones=" + Arrays.toString(vagones) +
                '}';
    }
}
