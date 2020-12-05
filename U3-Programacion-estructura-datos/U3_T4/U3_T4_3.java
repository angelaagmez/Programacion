package com.abg;

// Un restaurante nos ha encargado una aplicación para colocar a los clientes ensus mesas. En una mesa se pueden
// sentar de 0 (mesa vacía) a 4 comensales(mesa llena). Cuando llega un cliente se le pregunta cuántos son.
// De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por
// ejemplo que son un grupo de 6, el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de
// 4 personas como máximo e intente de nuevo”. Para el grupo que llega, se buscasiempre la primera mesa libre (con 0
// personas). Si no quedan mesas libres, se busca donde haya un hueco para ttodo el grupo, por ejemplo si el
// grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,las mesas se cargan con
// valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
// Los grupos no se pueden romper aunque haya huecos sueltos suficientes.

import java.util.Arrays;
import java.util.Scanner;

public class U3_T4_3 {
    public static final int CAPACIDAD = 4;

    public static void main(String[] args) {
        int[] mesas = new int[10];
        int[] nummesas = {1,2,3,4,5,6,7,8,9,10};
        int entrada;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < mesas.length ; i++) {
            mesas[i] = (int) (Math.random()*5);
        }

        System.out.println(Arrays.toString(nummesas));
        System.out.println(Arrays.toString(mesas));

        do {
            System.out.println("Cúantos son?. (-1 para salir)");
            entrada = sc.nextInt();

            if (entrada!=-1) {
                if (hayMesaVacia(mesas) && entrada<=CAPACIDAD) {
                    for (int i = 0; i < mesas.length ; i++) {
                        if (mesas[i]==0) {
                            mesas[i] = entrada;
                            System.out.println("A LA MESA: "+(i+1));
                            break;
                        }
                    }
                } else if (hayHueco(mesas,entrada)) {
                    for (int i = 0; i < mesas.length ; i++) {
                        if (mesas[i]+entrada<=CAPACIDAD) {
                            mesas[i] = mesas[i]+entrada;
                            System.out.println("A LA MESA: "+(i+1));
                            break;
                        }
                    }
                } else {
                    System.out.println("NO HAY SITIO");
                }
            }

            System.out.println(Arrays.toString(nummesas));
            System.out.println(Arrays.toString(mesas));

        } while (entrada!=-1);
    }

    public static boolean hayMesaVacia(int[] m) {

        for (int i = 0; i < m.length; i++) {
            if (m[i]==0) {
                return true;
            }
        }

        return false;
    }

    public static boolean hayHueco(int[] m, int entrada) {
        for (int i = 0; i < m.length; i++) {
            if (m[i]+entrada<=CAPACIDAD) {
                return true;
            }
        }

        return false;
    }

}
