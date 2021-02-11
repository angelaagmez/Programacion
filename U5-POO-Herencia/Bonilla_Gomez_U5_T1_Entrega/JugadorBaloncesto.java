package Bonilla_Gomez_U5_T1_Entrega;

public class JugadorBaloncesto extends Participante implements Encestar{
    private double altura;

    public JugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+nombre+" como jugador de baloncesto, juro los valores deportivos mundiales.");
    }

    @Override
    public String toString() {
        return "JugadorBaloncesto{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
