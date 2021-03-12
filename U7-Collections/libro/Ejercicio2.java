package libro;

// Realiza un programa que escoja al azar 10 cartas de la baraja española
//(10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
//almacenarlas y asegúrate de que no se repite ninguna.

import java.util.Objects;

public class Ejercicio2 {
    private String numcarta;
    private String tipocarta;

    public Ejercicio2(String numcarta, String tipocarta) {
        this.numcarta = numcarta;
        this.tipocarta = tipocarta;
    }

    public String getNumcarta() {
        return numcarta;
    }

    public void setNumcarta(String numcarta) {
        this.numcarta = numcarta;
    }

    public String getTipocarta() {
        return tipocarta;
    }

    public void setTipocarta(String tipocarta) {
        this.tipocarta = tipocarta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio2 that = (Ejercicio2) o;
        return numcarta.equals(that.numcarta) && tipocarta.equals(that.tipocarta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcarta, tipocarta);
    }

    @Override
    public String toString() {
        return "Ejercicio2{" +
                "numcarta='" + numcarta + '\'' +
                ", tipocarta='" + tipocarta + '\n' +
                '}';
    }
}
