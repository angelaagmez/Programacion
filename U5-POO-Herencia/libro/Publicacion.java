package U5.libro;

import java.util.Calendar;

public abstract class Publicacion {
    protected String ISBN;
    protected String titulo;
    protected Calendar año;

    public Publicacion(String ISBN, String titulo, Calendar año) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.año = año;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getAño() {
        return año;
    }

    public void setAño(Calendar año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                '}';
    }
}
