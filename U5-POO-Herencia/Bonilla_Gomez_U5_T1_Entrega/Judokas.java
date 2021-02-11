package Bonilla_Gomez_U5_T1_Entrega;

public class Judokas extends Participante implements Luchar {
    private int peso;

    public Judokas(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+nombre+" como judoka, juro los valores deportivos mundiales.");
    }


    @Override
    public String toString() {
        return "Judokas{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
