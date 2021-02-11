package U5.libro;

import java.util.Calendar;

public class Main_Publicacion {
    public static void main(String[] args) {
        Libro l1 = new Libro("123-456-XXX","Pepito de los palotes", Calendar.getInstance());
        Libro l2 = new Libro("654-234-PPP","Pinocho", Calendar.getInstance());
        Revista r1 = new Revista("756-874-FFF","Corazon",Calendar.getInstance(),12345);
        Revista r2 = new Revista("234-323-UUUU","Pop",Calendar.getInstance(),10789);


        l1.presta();
        l2.devuelve();

        l1.estaPrestado();
        l1.devuelve();

        l2.estaPrestado();
        l1.estaPrestado();

    }
}
