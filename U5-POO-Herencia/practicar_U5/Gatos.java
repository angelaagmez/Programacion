package practicar_U5;

public class Gatos extends Compania implements Avisar {
    public Gatos(String nombre, int peso) {
        super(nombre, peso, 0);
    }

    @Override
    public void sonido() {
        System.out.println("MIAU ("+nombre+")");
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "cantAvisos=" + cantAvisos +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void aviso() {
        System.out.println("MIAU");
    }
}
