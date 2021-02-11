package U5.ejemplo_interfaces;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    private static int numInstancias=0;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        numInstancias++;
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

    public abstract void saludar();

    public void gritar(){
        System.out.println("AAGGGGG");
    }

    public static int getNumInstancias() {
        return numInstancias;
    }
}
