package U5.ejercicio_adicional;

public class Sierra extends Herramientas{
    private double diametro;

    public Sierra(String nombre, int masa, int quemar, int diluir, boolean movible, double diametro) {
        super(nombre, masa, quemar, diluir, movible);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Sierra{" +
                "diametro=" + diametro +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", quemar=" + quemar +
                ", diluir=" + diluir +
                ", movible=" + movible +
                '}';
    }
}
