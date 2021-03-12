package practicar_U5;

public class Cerdos extends Ganado{
    public Cerdos(String nombre, int peso, String identificador, int calidad) {
        super(nombre, peso, identificador, calidad);
    }

    @Override
    public void sonido() {
        System.out.println("OINK ("+nombre+")");
    }

    @Override
    public String toString() {
        return "Cerdos{" +
                "identificador='" + identificador + '\'' +
                ", calidad='" + calidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
