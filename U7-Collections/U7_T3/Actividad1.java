package U7_T3;

// Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
// La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma de sus dígitos.
//
//46221877D -> 4+6+2+2+1+8+7+7=37
//
//Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.

import java.util.HashMap;

public class Actividad1 {
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<Integer, String>();

        alumnos.put(clave("12345678H"),"Gonzalo Waack");
        alumnos.put(clave("98364758Y"),"Alicia Acosta");
        alumnos.put(clave("12673892U"),"Pedro Larrubia");
        alumnos.put(clave("74632938P"),"Angela Bonilla");

        System.out.println(alumnos);
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

        /* Otra forma:
       for (int i = 0; i < dni.length()-1; i++) {
            resultado += Integer.parseInt(Character.toString(dni.charAt(i)));
        }
        */

        return resultado;
    }
}