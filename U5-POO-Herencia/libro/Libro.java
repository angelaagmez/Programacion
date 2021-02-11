package U5.libro;

import java.util.Calendar;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(String ISBN, String titulo, Calendar año) {
        super(ISBN, titulo, año);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                '}';
    }

    @Override
    public boolean presta() {
        this.prestado = true;
        if (this.prestado){
            System.out.println("El libro ha sido alquilado correctamente");
            return true;
        } else {
            System.out.println("El libro no se puede alquilar");
            return false;
        }
    }

    @Override
    public boolean devuelve() {
        if (this.prestado){
            this.prestado=false;
            System.out.println("El libro ha sido devuelto con éxito");
            return true;
        } else {
            System.out.println("El libro no se puede devolver");
            return false;
        }
    }

    @Override
    public boolean estaPrestado() {
        if (this.prestado){
            System.out.println("El libro está prestado");
            return true;
        } else {
            System.out.println("El libro no está prestado");
            return false;
        }
    }
}
