package practicar_U5;

public class Gallinas extends Ganado{
    public Gallinas(String nombre, int peso, String identificador, int calidad) {
        super(nombre, peso, identificador, calidad);
    }

    @Override
    public void sonido() {
        System.out.println("KIKIRIKI ("+nombre+")");
    }

    @Override
    public String toString() {
        return "Gallinas{" +
                "identificador='" + identificador + '\'' +
                ", calidad='" + calidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
