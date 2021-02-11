package U5.ejercicio_adicional;

public class Pico extends Herramientas implements Minar{
    private int grosor;

    public Pico(String nombre, int masa, int quemar, int diluir, boolean movible, int grosor) {
        super(nombre, masa, quemar, diluir, movible);
        this.grosor = grosor;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Pico{" +
                "grosor=" + grosor +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", quemar=" + quemar +
                ", diluir=" + diluir +
                ", movible=" + movible +
                '}';
    }
}
