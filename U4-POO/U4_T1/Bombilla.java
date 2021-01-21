package U4_T1;

// Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
// Para ello hacer una clase Bombilla con una variable privada que indique si está encencida o apagada, así como un
// método que nos diga el estado de la bombilla. Además, queremos poner un interruptor general, de forma que si saltan
// los fusibles, todas las bombillas se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a
// estar encendidas o apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se apagan individualmente,
// pero solo responde si su interruptor particular está activado y además hay luz general.

public class Bombilla {
    private boolean encendida;

    public Bombilla() {
        this.encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void interuptorBombilla() {
        if (!encendida){
            this.encendida = true;
        } else {
            this.encendida = false;
        }
    }


    public boolean estado() {
        if (encendida) {
            System.out.println("Bombilla encendida");
            return true;
        } else {
            System.out.println("Bombilla apagada");
            return false;
        }
    }


}


