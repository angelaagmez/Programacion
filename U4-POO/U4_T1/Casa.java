package U4_T1;

import java.util.Arrays;

public class Casa {
    public boolean encendidoGeneral;
    Bombilla[] bombillas;

    public Casa(int num) {
        this.encendidoGeneral = true;
        bombillas = new Bombilla[num];

        for (int i = 0; i < num; i++) {
            bombillas[i] = new Bombilla();
        }

    }

    public void interruptorGeneral() {
        if (!encendidoGeneral) {
            this.encendidoGeneral = true;
        } else {
            this.encendidoGeneral = false;
        }
    }

    public void infoCasa(){
        for (int i = 0; i < bombillas.length; i++) {
            if (encendidoGeneral){
                bombillas[i].estado();
            } else {
                System.out.println("Ha saltado el fusible");
                break;
            }
        }
    }

    public void setinterruptorBombilla(int num){
        bombillas[num].interuptorBombilla();
    }

    public void anadirBombilla() {
        bombillas = Arrays.copyOf(bombillas,bombillas.length+1);
        bombillas[bombillas.length-1] = new Bombilla();
    }

    public void anadirBombilla(int num) {
        for (int i = 0; i < bombillas.length; i++) {
            this.anadirBombilla();
        }
    }

}
