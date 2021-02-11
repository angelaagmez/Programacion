package Bonilla_Gomez_U5_T1_Entrega;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JuegosDeportivosMundiales juegos = new JuegosDeportivosMundiales();

        Edicion edicion1 = new Edicion(1994,"Sevilla");
        Edicion edicion2 = new Edicion(2004,"Madrid");
        Edicion edicion3 = new Edicion(1993,"China");
        Edicion edicion4 = new Edicion(2008,"Paris");

        juegos.addEdiciones(edicion1);
        juegos.addEdiciones(edicion2);
        juegos.addEdiciones(edicion3);
        juegos.addEdiciones(edicion4);

        System.out.println(juegos);
        System.out.println("");

        Pais pais1 = new Pais("Francia",10);
        Pais pais2 = new Pais("España",15);
        Pais pais3 = new Pais("Alemania", 8);
        Pais pais4 = new Pais("Noruega",12);
        Pais pais5 = new Pais("Suiza",6);


        Atletismo atletismo = new Atletismo("Pabellon 2",7);
        Judo judo = new Judo("Pabellon 3", 10);
        Baloncesto baloncesto = new Baloncesto("Pabellon 1",15);


        edicion1.addPaises(pais1);
        edicion1.addPaises(pais2);
        edicion1.addDeportes(judo);
        System.out.println(edicion1);

        edicion2.addPaises(pais3);
        edicion2.addPaises(pais4);
        edicion2.addPaises(pais1);
        edicion2.addDeportes(atletismo);
        System.out.println(edicion2);

        edicion3.addPaises(pais2);
        edicion3.addPaises(pais3);
        edicion3.addDeportes(judo);
        System.out.println(edicion3);

        edicion4.addPaises(pais1);
        edicion4.addPaises(pais2);
        edicion4.addPaises(pais3);
        edicion4.addPaises(pais4);
        edicion4.addDeportes(baloncesto);
        edicion4.deletePais("Suiza");
        edicion4.addDeportes(atletismo);
        edicion4.addDeportes(judo);
        System.out.println(edicion4);
        edicion4.deleteDeporte("Judo");
        System.out.println(edicion4);

        System.out.println("");

        Atletas atleta1 = new Atletas("Juan Torres",28,"Salto de pertiga");
        Atletas atleta2 = new Atletas("Anabel Gomez",34,"Carrera 400m");
        Atletas atleta3 = new Atletas("Pepe Perez",32,"Relevos");
        Atletas atleta4 = new Atletas("Rocio Cobos",20,"Velocidad");
        Atletas atleta5 = new Atletas("Soraya Ortega",24,"Relevos");

        Judokas judoka1 = new Judokas("Jose Jimenez",25,80);
        Judokas judoka2 = new Judokas("Clara Rocas",29,75);
        Judokas judoka3 = new Judokas("Laura Garcia",30,78);

        JugadorBaloncesto jugador1 = new JugadorBaloncesto("Pablo Ruiz",23,1.8);
        JugadorBaloncesto jugador2 = new JugadorBaloncesto("Inma Pulido",20,1.75);
        JugadorBaloncesto jugador3 = new JugadorBaloncesto("Angela Velazquez",27,1.72);
        JugadorBaloncesto jugador4 = new JugadorBaloncesto("Ana Gonzalez",18,1.69);


        atletismo.addAtleta(atleta1);
        atletismo.addAtleta(atleta2);
        atletismo.addAtleta(atleta3);
        atletismo.addAtleta(atleta4);
        atletismo.addAtleta(atleta5);
        System.out.println(atletismo);
        atletismo.deleteAtleta(atleta3);
        System.out.println("");

        judo.addJudoka(judoka1);
        judo.addJudoka(judoka2);
        judo.addJudoka(judoka3);
        System.out.println(judo);
        judo.deleteJudoka(judoka2);
        System.out.println(judo);
        System.out.println("");

        baloncesto.addJugadores(jugador1);
        baloncesto.addJugadores(jugador2);
        baloncesto.addJugadores(jugador3);
        baloncesto.addJugadores(jugador4);
        System.out.println(baloncesto);
        baloncesto.deleteJugadores(jugador4);
        System.out.println(baloncesto);
        System.out.println("");


        atleta1.hacerjuramento();
        judoka3.hacerjuramento();
        jugador2.hacerjuramento();
        System.out.println("");

        atleta3.correr();
        judoka1.luchar();
        jugador1.encestar();
        System.out.println("");


        edicion4.mostrarPaises();
        edicion2.mostrarPaisesParaCeremonia();
        atletismo.mostrarParticipantes();
        baloncesto.mostrarJugadoresBaloncestPorAltura();
        System.out.println("");

        System.out.println("JUEGOS:");
        System.out.println(juegos);

    }
}
