import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Maraton m = new Maraton();

        Map<Integer,Atleta> lista_atletas = new LinkedHashMap<>();

        Atleta a1 = new Atleta("Angela","España","Junior");
        Atleta a2 = new Atleta("Gonzalo","Alemania",35456,"Junior");
        Atleta a3 = new Atleta("Alicia","Suiza",32678,"Junior");
        Atleta a4 = new Atleta("Pedro","Francia","Junior");
        Atleta a5 = new Atleta("Alvaro","España",57480,"Junior");

        Atleta a6 = new Atleta("Ana", "Francia",67893,"Senior");
        Atleta a7 = new Atleta("Antonio","Suiza",24345,"Senior");
        Atleta a8 = new Atleta("Cristina","Alemania",87437,"Senior");
        Atleta a9 = new Atleta("Anabel","Holanda",34759,"Senior");
        Atleta a10 = new Atleta("Ramon","Noruega",46523,"Senior");

        Atleta a11 = new Atleta("Lorena","Alemania",93478,"Veterano");
        Atleta a12 = new Atleta("Juanjo","Holanda","Veterano");
        Atleta a13 = new Atleta("Pepe","Noruega",56784,"Veterano");
        Atleta a14 = new Atleta("Gema","España","Veterano");
        Atleta a15 = new Atleta("Fabian","España","Veterano");

        // Probando el codigo sin usar el menu y sin introducir por teclado

        lista_atletas.put(0,a1);
        lista_atletas.put(1,a2);
        lista_atletas.put(2,a3);
        lista_atletas.put(3,a4);
        lista_atletas.put(4,a5);
        lista_atletas.put(5,a6);
        lista_atletas.put(6,a7);
        lista_atletas.put(7,a8);
        lista_atletas.put(8,a9);
        lista_atletas.put(9,a10);
        lista_atletas.put(10,a11);
        lista_atletas.put(11,a12);
        lista_atletas.put(12,a13);
        lista_atletas.put(13,a14);
        lista_atletas.put(14,a15);

        m.setLista_atletas(lista_atletas);

        System.out.println(m);


        // Probando el codigo con el menu e introduciendo atletas por teclado

        int opcion;
        do {
            mostrarMenu();
            System.out.println("Elige una opcion del menu");
            opcion = sc.nextInt();

            if (opcion!=9){
                switch (opcion){
                    case 1:
                        m.cargarAtletas();
                        break;
                    case 2:
                        m.guardarAtletas();
                        break;
                    case 3:
                        m.inscribirAtleta();
                        System.out.println(m);
                        break;
                    case 4:
                        System.out.println("Introduce el dorsal del atleta al que quieras guardar el tiempo");
                        int dorsal = sc.nextInt();
                        System.out.println("Introduce el tiempo que ha tardado en realizar el maraton");
                        int marca = sc.nextInt();

                        m.guardarTiempo(dorsal,marca);
                        System.out.println(m);
                        break;
                    case 5:
                        System.out.println("Introduce el dorsal del atleta que quieras eliminar");
                        int num = sc.nextInt();
                        m.borrarAtleta(num);
                        System.out.println(m);
                        break;
                    case 6:
                        m.mostrarListaFinishers();
                        break;
                    case 7:
                       // m.mostrarListaCategoria();
                        break;
                    case 8:
                       // m.participantesPorPais();
                        break;
                    case 9:
                        break;
                }
            }


        }while (opcion!=9);


        System.out.println(m);
    }

    public static void mostrarMenu(){
        System.out.println("1.Cargar atletas");
        System.out.println("2.Guardar atletas");
        System.out.println("3.Inscribir atletas");
        System.out.println("4.Guardar tiempo");
        System.out.println("5.Borrar Atleta");
        System.out.println("6.Mostrar lista finishers");
        System.out.println("7.Mostrar lista categoria");
        System.out.println("8.Participantes por pais");
        System.out.println("9.Salir");
    }
}
