package U5.T2.ejemplo;

import java.util.Comparator;

public class Libro implements Comparable<Libro> {
    String ISBN;        // ordenar por este
    int paginas;        // ordenar con clase aparte
    int precio;         // ordenar con clase anonima
    String autor;       // ordenar con clase anonima
    String editorial;   // ordenar con clase aparte

    public Libro(String ISBN, int paginas, int precio, String autor, String editorial) {
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }


    @Override
    public int compareTo(Libro o) {
        return this.getISBN().compareToIgnoreCase(o.getISBN());
    }
}
