package U4_T1.maquinaria;

import U4_T1.personal.Maquinista;
import U4_T1.personal.Mecanico;

import java.util.Arrays;

public class U4_T1_9 {
    public static void main(String[] args) {
        Mecanico m = new Mecanico("Pepe Perez","678456123");
        Locomotora l = new Locomotora("1234",1000,1999,m);
        Maquinista ma = new Maquinista("Paula Prieto","12345678E",2050.3,"Rango 3");

        Vagon[] vagones = {new Vagon(10000,1500,"MERCANCIA"),
                           new Vagon(11000,2000,"PASAJEROS"),
                           new Vagon(12000,3500,"PASAJEROS"),
                           new Vagon(13000,4000,"PASAJEROS"),
                           new Vagon(14000,5500,"PASAJEROS")};


        Tren t = new Tren(l,ma);
        Tren t2 = new Tren(l,ma,vagones);

        System.out.println("TREN 1: "+t);
        System.out.println("TREN 2: "+t2);

        System.out.println(t.addVagon(new Vagon(15000,1500,"PASAJEROS")));
        System.out.println(t2.addVagon(new Vagon(15000,1500,"PASAJEROS")));

        System.out.println("AÑADIMOS VAGON EN TREN 1: "+t);
        System.out.println("AÑADIMOS VAGON EN TREN 2: "+t2);

        t2.removeVagon();

        System.out.println("QUITAMOS VAGON EN TREN 2: "+t2);

    }

}
