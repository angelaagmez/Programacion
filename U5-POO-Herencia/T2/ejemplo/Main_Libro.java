package U5.T2.ejemplo;

import java.util.Arrays;
import java.util.Comparator;

public class Main_Libro {
    public static void main(String[] args) {
        Libro l1 = new Libro("123-AA-BB",134,15,"Pepe Perez","Anaya");
        Libro l2 = new Libro("765-DD-BB",200,20,"Manuel Rodriguez","PlanetadeLibros");
        Libro l3 = new Libro("987-SS-ZZ",189,18,"Rosa Martinez","Bdvoino");
        Libro l4 = new Libro("546-AA-WW",350,25,"Angela Bonilla","Zamdond");
        Libro l5 = new Libro("388-KK-TT",480,30,"Pedro Larrubia","Wppdnjd");
        Libro l6 = new Libro("648-NN-MM",871,40,"Alicia Acosta","Poeinjf");
        Libro l7 = new Libro("346-TT-II",567,34,"Gonzalo Waack","Towiefjkj");
        Libro l8 = new Libro("241-VV-HH",756,37,"Agustina Hoyos","Yiueuh");
        Libro l9 = new Libro("789-UU-EE",240,23,"Silvia Toledo","Vpaoie");
        Libro l10 = new Libro("478-OO-PP",117,12,"Victor Velazquez","Cjenfi");

        Libro[] libro = {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
        System.out.println("Lista de libros");
        System.out.println(Arrays.toString(libro));

        System.out.println("Libros ordenados por ISBN");
        Arrays.sort(libro);
        System.out.println(Arrays.toString(libro));

        System.out.println("Libros ordenados por paginas");
        Arrays.sort(libro, new ComparadorPaginas());
        System.out.println(Arrays.toString(libro));

        System.out.println("Libros ordenados por editorial");
        Arrays.sort(libro, new ComparadorEditorial());
        System.out.println(Arrays.toString(libro));

        System.out.println("Libros ordenados por precio");
        Arrays.sort(libro, new Comparator<Libro>() {
            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getPrecio()-o2.getPrecio();
            }
        });
        System.out.println(Arrays.toString(libro));

        System.out.println("Libros ordenados por autor");
        Arrays.sort(libro, new Comparator<Libro>() {
            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getAutor().compareToIgnoreCase(o2.getAutor());
            }
        });
        System.out.println(Arrays.toString(libro));
    }
}
