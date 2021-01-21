package U5.prueba;

public class Profesor extends Persona{
    String nss;
    String asignatura;

    public Profesor(String nombre, String dni, String tlf, String email, String direccion, String nss, String asignatura) {
        super(nombre, dni, tlf, email, direccion);
        this.nss = nss;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nss='" + nss + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


    // Override para modificar metodos del padre en el hijo

    @Override
    public void gritar(){
        System.out.println("El profesor no grita");
    }
}
