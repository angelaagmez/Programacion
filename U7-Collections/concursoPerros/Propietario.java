package concursoPerros;

public class Propietario {
    private String nombre;
    private String apellidos;
    private int numSocio;
    private String pais;

    public Propietario(String nombre, String apellidos, int numSocio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.pais = pais;
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

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numSocio=" + numSocio +
                ", pais='" + pais + '\'' +
                '}';
    }
}
