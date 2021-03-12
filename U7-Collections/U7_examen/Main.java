package Bonilla_Gomez_U7_entrega;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Instituto ins = new Instituto("IES Alixar");

        Alumnos a1 = new Alumnos("Angela","Bonilla Gomez","74389237U","2ºB");
        Alumnos a2 = new Alumnos("Gonzalo","Waack Carneado","94857392B","2ºA");
        Alumnos a3 = new Alumnos("A.Cristina","Velazquez Ortega","938747283N","2ºB");
        Alumnos a4 = new Alumnos("Guillermo","Rodriguez Tutor","39485739M","2ºA");
        Alumnos a5 = new Alumnos("Ana","Camacho Payan","93487238A","3ºB");

        ins.addAlumnoUnidad(a1,"2ºB");
        ins.addAlumnoUnidad(a2,"2ºA");
        ins.addAlumnoUnidad(a3,"2ºB");
        ins.addAlumnoUnidad(a4,"2ºA");
        ins.addAlumnoUnidad(a5,"3ºB");

        ins.cargarAlumnos();
        ins.guardarAlumnos();

        System.out.println(ins.toString());

        System.out.println("");

        System.out.println(ins.obtenerUnidadAlumno(a1.getGuardarId()));
        System.out.println(ins.obtenerUnidadAlumno(a5.getGuardarId()));
        System.out.println(ins.obtenerUnidadAlumno(a2.getGuardarId()));

        System.out.println("");

        ins.mostrarTodosAlumnosOrdenados();
        ins.mostrarAlumnosUnidad("2ºB");


    }
}
