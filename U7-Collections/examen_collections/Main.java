package examen_collections;

public class Main {
    public static void main(String[] args) {
        Coordenadas coord = new Coordenadas(397847,1013739475);
        Medicion medicion = new Medicion(58,20,40);
        Medicion medicion2 = new Medicion(88,10,70);
        Medicion medicion3 = new Medicion(74,50,65);
        Medicion medicion4 = new Medicion(69,40,30);
        EstacionMeteorologica est = new EstacionMeteorologica("datos.dat",coord);


        est.addMedicion(medicion);
        est.addMedicion(medicion2);
        est.addMedicion(medicion3);
        est.addMedicion(medicion4);

        System.out.println(est);

        est.ordenaTemperaturasAsc();
        System.out.println(est);
        est.ordenaHumedadesDesc();
        System.out.println(est);
        est.presionMaxima();
        est.buscaMedicion(medicion3);

        est.guardarFichero("datos.dat");


    }
}
