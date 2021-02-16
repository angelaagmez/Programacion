package examen_U4U5;

public class Main {
    public static void main(String[] args) {
        Fara f = new Fara();

        Cajas c1 = new Cajas("123A");
        Cajas c2 = new Cajas("984Z");
        Cajas c3 = new Cajas("894V");
        Cajas c4 = new Cajas("458D");

        Prendas p1 = new PrendaColgada(10,"Camiseta",123,4,1.2);
        Prendas p2 = new PrendaNormal(15,"Pantalones",843,7);
        Prendas p3 = new PrendaColgada(30,"Chaqueta",976,12,1.7);
        Prendas p4 = new PrendaNormal(24,"Falda",738,9);

        Conductor cond1 = new Conductor("Pepe", "Perez","12345678P","123-342-473");
        Conductor cond2 = new Conductor("Rosa", "Lopez","14939302R","984-233-454");

        CamionCajas cc1 = new CamionCajas("123-TFV",15,cond1);
        CamionCajas cc2 = new CamionCajas("432-NUH",20,cond2);
        CamionCajas cc3 = new CamionCajas("876-MIU",25,cond1);
        CamionCajas cc4 = new CamionCajas("987-SID",30,cond2);

        CamionPerchas cp1 = new CamionPerchas("154-IUD",20,cond1);
        CamionPerchas cp2 = new CamionPerchas("456-PUN",40,cond2);
        CamionPerchas cp3 = new CamionPerchas("234-FTU",23,cond1);
        CamionPerchas cp4 = new CamionPerchas("087-YHN",35,cond2);

        System.out.println("RELLENANDO CAJAS:");
        c1.addPrendas(p1);
        c1.addPrendas(p2);
        c1.addPrendas(p3);
        c1.addPrendas(p4);
        System.out.println(c1);
        c1.deletePrendas(976);
        System.out.println(c1);

        c2.addPrendas(p1);
        c2.addPrendas(p2);
        c2.addPrendas(p3);
        System.out.println(c2);


        c3.addPrendas(p1);
        c3.addPrendas(p3);
        c3.addPrendas(p4);
        System.out.println(c3);

        c4.addPrendas(p2);
        c4.addPrendas(p4);
        System.out.println(c4);

        System.out.println("");
        System.out.println("METIENDO CAJAS Y PRENDAS EN LOS CAMIONES: ");

        cc1.addCajas(c1);
        cc1.addCajas(c2);
        cc1.addCajas(c3);
        cc1.addCajas(c4);
        System.out.println(cc1);
        cc1.deleteCajas("458D");
        System.out.println(cc1);

        cc2.addCajas(c4);
        cc2.addCajas(c2);
        cc2.addCajas(c1);
        System.out.println(cc2);

        cc3.addCajas(c3);
        System.out.println(cc3);

        cc4.addCajas(c1);
        cc4.addCajas(c4);
        System.out.println(cc4);

        System.out.println("");

        cp1.addPrendas(p1);
        cp1.addPrendas(p3);
        System.out.println(cp1);

        cp2.addPrendas(p2);
        cp2.addPrendas(p1);
        cp2.addPrendas(p4);
        System.out.println(cp2);

        cp3.addPrendas(p1);
        cp3.addPrendas(p2);
        cp3.addPrendas(p3);
        cp3.addPrendas(p4);
        System.out.println(cp3);
        cp3.deletePrendas(843);
        System.out.println(cp3);

        cp4.addPrendas(p1);
        cp4.addPrendas(p2);
        cp4.addPrendas(p3);
        cp4.addPrendas(p4);
        System.out.println(cp4);

        System.out.println("");

        f.addCamionCajas(cc1);
        f.addCamionCajas(cc2);
        f.addCamionCajas(cc3);
        f.addCamionCajas(cc4);

        f.addCamionPerchas(cp1);
        f.addCamionPerchas(cp2);
        f.addCamionPerchas(cp3);
        f.addCamionPerchas(cp4);

        System.out.println("MOSTRAMOS LA FLOTA DE CAMIONES: ");
        System.out.println(f);
        System.out.println("");

        System.out.println("ACCIONES: ");

        p1.colgar();
        p1.devolver();
        p1.doblar();

        p2.devolver();
        p2.doblar();

        cc1.descargar();
        cp1.descargar();

        System.out.println("");

        System.out.println("ORDENACION: ");

        f.mostrarxCajas();
        f.mostrarxPrendas();
        f.mostrarxPeso();

        System.out.println("");






    }
}
