package practicar_U5;

public class Vacas extends Ganado{
    public Vacas(String nombre, int peso, String identificador, int calidad) {
        super(nombre, peso, identificador, calidad);
    }

    @Override
    public void sonido() {
        System.out.println("MUUUU ("+nombre+")");
    }

    @Override
    public String toString() {
        return "Vacas{" +
                "identificador='" + identificador + '\'' +
                ", calidad='" + calidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
