package examen_U4U5;

public class Conductor {
    private String nombre;
    private String apellidos;
    private String dni;
    private String nss;

    public Conductor(String nombre, String apellidos, String dni, String nss) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", nss='" + nss + '\'' +
                '}';
    }
}
