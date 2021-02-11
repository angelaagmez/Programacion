package U5.libro;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    public void come(int num) {
        this.peso += num - 1;
    }

    public void come(Ameba a) {
        this.peso += a.peso - 1;
        a.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos";
    }
}