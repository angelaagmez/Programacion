package U5.prueba;

public class Alumnos extends Persona{
    private String curso;
    private Integer edad;


    public Alumnos(String nombre, String dni, String tlf, String email, String direccion, String curso, Integer edad) {
        super(nombre, dni, tlf, email, direccion);
        this.curso = curso;
        this.edad = edad;
    }

    public Alumnos(String nombre, String dni, String tlf, String direccion, String curso, Integer edad) {
        super(nombre, dni, tlf, direccion);
        this.curso = curso;
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "curso='" + curso + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public void gritar(){
        System.out.println("AAJHHHHAHAHAHA");
    }
}
