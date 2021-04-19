package examen2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maraton2 maraton = new Maraton2();
        int opcion;

        do {
            menu();
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

            if (opcion!=9){
                switch (opcion){
                    case 1:
                        maraton.cargarAtletas();
                        break;
                    case 2:
                        maraton.guardarAtletas();
                        break;
                    case 3:
                        maraton.inscribirAtleta();
                        break;
                    case 4:
                        System.out.println("Introduce el dorsal");
                        int dorsal = sc.nextInt();
                        System.out.println("Introduce la marca");
                        int marca = sc.nextInt();
                        maraton.guardarTiempo(dorsal,marca);
                        break;
                    case 5:
                        System.out.println("Introduce el dorsal");
                        int dorsal2 = sc.nextInt();
                        maraton.borrarAtleta(dorsal2);
                        break;
                    case 6:
                        maraton.mostrarListaFinishers();
                        break;
                    case 7:
                        System.out.println("Introduce la categoria");
                        String categoria = sc.nextLine();
                        maraton.mostrarListaCategoria(categoria);
                    case 8:
                        System.out.println("Introduce el pais");
                        String pais = sc.nextLine();
                        maraton.participantesPorPais(pais);
                        break;
                }
            }
        } while (opcion!=9);
    }

    public static void menu(){
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
