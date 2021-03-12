package U7_T3;

// Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni, calculará
// la clave que ha de consultar, comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado
// a esa clave en el HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<Integer, String>();

        alumnos.put(clave("12345678H"),"Gonzalo Waack");
        alumnos.put(clave("98364758Y"),"Alicia Acosta");
        alumnos.put(clave("12673892U"),"Pedro Larrubia");
        alumnos.put(clave("74632938P"),"Angela Bonilla");

        System.out.println(alumnos);

        Scanner sc = new Scanner(System.in);
        String dni;

            System.out.println("Introduce un dni");
            dni = sc.nextLine();

            if (alumnos.containsKey(clave(dni))){   // alumnos.get(clave(dni))!=null
                System.out.println(alumnos.get(clave(dni)));
            }else {
                System.out.println("No existe ese alumno");
            }


    }

    public static Integer clave(String dni) {
        Integer resultado = 0;

        for (int i = 0; i < dni.length(); i++) {
            if (dni.charAt(i) == '0' || dni.charAt(i) == '1' || dni.charAt(i) == '2' || dni.charAt(i) == '3'
                    || dni.charAt(i) == '4' || dni.charAt(i) == '5' || dni.charAt(i) == '6'
                    || dni.charAt(i) == '7' || dni.charAt(i) == '8' || dni.charAt(i) == '9') {
                resultado += Integer.parseInt(Character.toString(dni.charAt(i)));
            }
        }
        return resultado;
    }
}
