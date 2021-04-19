package coronavirus;

public class Medicos {
    private String nombre;
    private String apellidos;
    private int numColegiado;
    private String nombreHospital;

    public Medicos(String nombre, String apellidos, int numColegiado, String nombreHospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numColegiado = numColegiado;
        this.nombreHospital = nombreHospital;
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

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    @Override
    public String toString() {
        return "Medicos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numColegiado=" + numColegiado +
                ", nombreHospital='" + nombreHospital + '\'' +
                '}';
    }
}
