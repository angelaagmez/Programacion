package libro;

import java.util.ArrayList;
import java.util.List;

public class Ej1_monedas {
    public static void main(String[] args) {
        List l1 = new ArrayList<Ejercicio1>();

        String[] valores = {"1cent","2cent","5cent","10cent","20cent","50cent","1€","2€"};
        String[] posicion = {"cara","cruz"};

        String v = valores[(int)(Math.random()*8)];  // genera uno de los 8 valores del array de arriba
        String p = posicion[Math.random()>0.5 ? 1 : 0];
        Ejercicio1 monedaprevia = new Ejercicio1(v,p);

        while(l1.size()<7){
            String v1 = valores[(int)(Math.random()*8)];  // genera uno de los 8 valores del array de arriba
            String p1 = posicion[Math.random()>0.5 ? 1 : 0];
            if ( (v1 == monedaprevia.getMoneda() && p1!= monedaprevia.getPosicion())
                    || (v1 != monedaprevia.getMoneda() && p1== monedaprevia.getPosicion())){
                Ejercicio1 moneda = new Ejercicio1(v1,p1);
                l1.add(moneda);
                monedaprevia = moneda;
            }
        }

        System.out.println(l1);
    }

}
