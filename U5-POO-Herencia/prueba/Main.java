package U5.prueba;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pepe Perez","12345678X","666777888","Aqui");
        Alumnos a = new Alumnos("Rosa Torres", "12341234R","777888999","Alli","DAW1",30);
        Profesor pr = new Profesor("Manuel Conde","55566676Z","129987365","mconde@gmail.com","Mas alla","Mc-645-937","Programacion");


        System.out.println(p);
        System.out.println(a);
        System.out.println(pr);

        p.gritar();
        a.gritar();
        pr.gritar();    // puedo usar metodos del padre en el hijo



    }
}
