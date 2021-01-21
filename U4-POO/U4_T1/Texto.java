// Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
//
//-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
//
//-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.
//
//-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.
//
//-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.


package U4_T1;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Texto {
    int longMax;
    char[] cadena;


    public Texto(int longMax) {
        this.longMax = longMax;
        this.cadena = new char[0];
    }

    public boolean anadirFinal(char caract){
        if (this.cadena.length+1 > longMax){
            System.out.println("Cadena completa");
            return false;
        } else {
            this.cadena = Arrays.copyOf(cadena,cadena.length+1);
            this.cadena[cadena.length-1] = caract;
            return true;
        }
    }



    public boolean anadirPrincipio(char caract) {
        if (this.cadena.length+1 > longMax){
            System.out.println("Cadena completa");
            return false;
        } else {
            char[] aux = new char[cadena.length+1];

            aux[0] = caract;


            for (int i = 0; i < cadena.length; i++) {
                aux[i+1] = cadena[i];
            }

            this.cadena = aux;

            return true;
        }
    }

    @Override
    public String toString() {
        return "Texto{" +
                "cadena = " + Arrays.toString(cadena) +
                '}';
    }
}
