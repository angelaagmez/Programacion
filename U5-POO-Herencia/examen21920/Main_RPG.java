package U5.examen21920;

import java.lang.reflect.GenericArrayType;

public class Main_RPG {
    public static void main(String[] args) {
        RPG rpg = new RPG();

        Elfos e1 = new Elfos("Elfi", 60,25,40);
        Enanos en1 = new Enanos("Em",150,30,35);
        Guerreros g1 = new Guerreros("Cid",300,90,75);
        Magos m1 = new Magos("Merlin",120,75,80);
        Orcos o1 = new Orcos("Shrek",350,95,65);
        Elfos e2 = new Elfos("Elmn", 60,25,40);
        Guerreros g2 = new Guerreros("Don Quijote",300,90,75);


        rpg.addPersonajes(e1);
        rpg.addPersonajes(en1);
        rpg.addPersonajes(g1);
        rpg.addPersonajes(m1);
        rpg.addPersonajes(o1);
        rpg.addPersonajes(e2);
        rpg.addPersonajes(g2);

        System.out.println("ESTADO INICIAL DE LOS PERSONAJES");
        rpg.mostrarEstado();


       // ((Atacar) rpg.getPersonajes()[0]).atacarPersonaje(o1);


        System.out.println("");
        System.out.println("COMBO DE ATAQUES 1");
        System.out.println(m1.encantar(e1));
        System.out.println(m1.encantar(en1));
        System.out.println(o1.atacarPersonaje(en1));
        System.out.println(g1.atacarPersonaje(e1));
        System.out.println(m1.encantar(g1));
        System.out.println(o1.atacarPersonaje(en1));
        System.out.println(g2.atacarPersonaje(e1));
        System.out.println(m1.encantar(e2));
        System.out.println(g2.atacarPersonaje(e2));
        System.out.println(g1.atacarPersonaje(e1));
        System.out.println(o1.atacarPersonaje(e1));

        System.out.println("");
        System.out.println("PERSONAJES CON VIDA");
        rpg.borrarMuertos();
        rpg.mostrarEstado();

        System.out.println("");
        System.out.println("COMBO DE ATAQUES 2");
        System.out.println(m1.encantar(g1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g1.atacarPersonaje(m1));
        System.out.println(m1.encantar(o1));
        System.out.println(o1.atacarPersonaje(m1));
        System.out.println(g2.atacarPersonaje(m1));
        System.out.println(m1.encantar(g2));
        System.out.println(g2.atacarPersonaje(m1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g1.atacarPersonaje(m1));

        System.out.println("");
        System.out.println("PERSONAJES CON VIDA");
        rpg.borrarMuertos();
        rpg.mostrarEstado();

        System.out.println("");
        System.out.println("COMBO DE ATAQUES 3");
        System.out.println(o1.atacarPersonaje(m1));
        System.out.println(g1.atacarPersonaje(m1));
        System.out.println(m1.desencantar(o1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g2.atacarPersonaje(m1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g1.atacarPersonaje(o1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(o1.atacarPersonaje(m1));

        System.out.println("");
        System.out.println("PERSONAJES CON VIDA");
        rpg.borrarMuertos();
        rpg.mostrarEstado();


        System.out.println("");
        System.out.println("COMBO DE ATAQUES 4");
        System.out.println(o1.atacarPersonaje(m1));
        System.out.println(g1.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g2.atacarPersonaje(m1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g1));
        System.out.println(g1.atacarPersonaje(o1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g2));
        System.out.println(g2.atacarPersonaje(o1));

        System.out.println("");
        System.out.println("PERSONAJES CON VIDA");
        rpg.borrarMuertos();
        rpg.mostrarEstado();


        System.out.println("");
        System.out.println("COMBO DE ATAQUES FINAL");
        System.out.println(o1.atacarPersonaje(g2));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g2));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g2));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(g2.atacarPersonaje(o1));
        System.out.println(o1.atacarPersonaje(g2));
        System.out.println(g2.atacarPersonaje(o1));

        rpg.borrarMuertos();


        System.out.println("");
        rpg.hayGanador();








    }
}
