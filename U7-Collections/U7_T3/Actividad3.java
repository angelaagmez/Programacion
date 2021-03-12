package U7_T3;

// Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas, de tal forma que se escriban los datos así:
//
//La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".
//
//La clave ... está asociada al nombre ....

import java.util.*;

public class Actividad3 {
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

        if (alumnos.get(clave(dni))!=null){
            System.out.println(alumnos.get(clave(dni)));
        }else {
            System.out.println("No existe ese alumno");
        }

        Set<Map.Entry<Integer,String>> alumnos2 = alumnos.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = alumnos2.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> p = iterator.next();
            System.out.println("La clave "+p.getKey()+" esta asociada al nombre "+p.getValue());
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
