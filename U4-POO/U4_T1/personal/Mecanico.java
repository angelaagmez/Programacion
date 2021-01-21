package U4_T1.personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public Mecanico(String nombre) {
        this(nombre,"",Especialidad.GENERAL);
    }

    public Mecanico(String nombre, String telefono) {
        this(nombre,telefono,Especialidad.MOTOR);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
