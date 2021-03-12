package practicar_U5;

public class Perros extends Compania implements Avisar{
    public Perros(String nombre, int peso) {
        super(nombre, peso, 0);
    }

    @Override
    public void sonido() {
        System.out.println("GUAU ("+nombre+")");
    }

    @Override
    public String toString() {
        return "Perros{" +
                "cantAvisos=" + cantAvisos +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void aviso() {
        System.out.println("GUAU");
    }
}
