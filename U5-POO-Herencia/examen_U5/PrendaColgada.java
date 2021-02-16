package examen_U4U5;

public class PrendaColgada extends Prendas{
    private double altura;
    private int cont=0;

    public PrendaColgada(double precio, String nombre, int codigo, int peso, double altura) {
        super(precio, nombre, codigo, peso, true);
        this.altura = altura;
        cont++;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura=" + altura +
                ", cont=" + cont +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", peso=" + peso +
                ", colgar=" + colgar +
                ", nºprendas colgadas=" + cont +
                '}';
    }



}
