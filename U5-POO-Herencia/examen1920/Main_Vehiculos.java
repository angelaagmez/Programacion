package U5.examen1920;


import U5.libro.Vehiculo;

import java.util.Arrays;

public class Main_Vehiculos {
    public static void main(String[] args) {

        Coches c1 = new Coches("Rayo","1234-XXX",1965,Color.ROJO);
        Coches c2 = new Coches("Fosforito","7659-TTT",1992,Color.AMARILLO);
        Coches c3 = new Coches("Puma","3251-BBB",2010,Color.AZUL);

        Motocicletas m1 = new Motocicletas("Trueno", "5424-CFW", 1872,Color.VERDE);
        Motocicletas m2 = new Motocicletas("Fusion", "2695-HRT",2002,Color.AZUL);
        Motocicletas m3 = new Motocicletas("La Dorada","9837-OIU",1998,Color.AMARILLO);

        Helicopteros h1 = new Helicopteros("La perla negra",1000,"UP-A300I");

        Avionetas v1 = new Avionetas("El pajaro loco",1500,"DOWN-B200P");


        Vehiculos[] v = {c1,c2,c3,m1,m2,m3,h1,v1};

        Garaje g = new Garaje(v);

        System.out.println(g);

        Terrrestre[] t = {c1,c2,c3,m1,m2,m3};

        /*
        System.out.println("");
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        System.out.println("");
        Arrays.sort(t,new ComparadorAños());
        System.out.println(Arrays.toString(t));
         */


        System.out.println("");
        h1.transportar(9);
        System.out.println(h1);

        System.out.println("");
        System.out.println(g);

    }
}
