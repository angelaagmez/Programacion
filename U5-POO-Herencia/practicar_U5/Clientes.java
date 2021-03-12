package practicar_U5;

public class Clientes extends Personas{
    int idComprador;

    public Clientes(String nombre, String dni, int edad, int idComprador) {
        super(nombre, dni, edad);
        this.idComprador = idComprador;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "idComprador=" + idComprador +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
