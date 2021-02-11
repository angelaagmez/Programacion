package U5.ejercicio_adicional;

public abstract class Herramientas extends Materiales {

    public Herramientas(String nombre, int masa, int quemar, int diluir, boolean movible) {
        super(nombre, masa, quemar, diluir, movible);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
