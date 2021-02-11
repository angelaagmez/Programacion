package U5.ejemplo_interfaces;

public class Profesor extends Persona{
    private String curso;
    private String modulo;

    public Profesor(String nombre, String apellidos, String curso, String modulo) {
        super(nombre, apellidos);
        this.curso = curso;
        this.modulo = modulo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public void saludar() {
        System.out.println("¿Como se encuentra usted?");
    }
}
