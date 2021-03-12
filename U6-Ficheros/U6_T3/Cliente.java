package U6_T3;

public class Cliente {
    private String nombre;
    private String dni;
    private int edad;

    public Cliente(String nombre, String dni, int edad) throws EdadErroneaException,MenorEdadException{
        this.nombre = nombre;
        this.dni = dni;
        if (edad<0 || edad>100){
            throw new EdadErroneaException("EdadErroneaException: Imposible crear el usuario con DNI "+dni+". La edad no puede ser negativa o mayor de 100 (Edad indicada: "+edad+").");
        } else if(edad<18){
            throw new MenorEdadException("MenorDeEdadException: Imposible crear el usuario con DNI "+dni+". El cliente no puede ser menor de edad (Edad indicada: "+edad+").");
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadErroneaException,MenorEdadException{
        if (edad<0 || edad>100){
            throw new EdadErroneaException("EdadErroneaException: Imposible crear el usuario con DNI "+dni+". La edad no puede ser negativa o mayor de 100 (Edad indicada: "+edad+").");
        } else if(edad<18){
            throw new MenorEdadException("MenorDeEdadException: Imposible crear el usuario con DNI "+dni+". El cliente no puede ser menor de edad (Edad indicada: "+edad+").");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
