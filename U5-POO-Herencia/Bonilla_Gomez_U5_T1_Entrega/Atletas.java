package Bonilla_Gomez_U5_T1_Entrega;

public class Atletas extends Participante implements Correr{
    private String nombreprueba;

    public Atletas(String nombre, int edad, String nombreprueba) {
        super(nombre, edad);
        this.nombreprueba = nombreprueba;
    }

    public String getNombreprueba() {
        return nombreprueba;
    }

    public void setNombreprueba(String nombreprueba) {
        this.nombreprueba = nombreprueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+nombre+" como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "nombreprueba='" + nombreprueba + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
