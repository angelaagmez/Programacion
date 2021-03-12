package U7_T6;

import java.util.*;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Double> lista_precios = new HashMap<String, Double>();
        List productos = new ArrayList<LineaPedido>();
        Double total = 0.0;

        lista_precios.put("tomate",1.59);
        lista_precios.put("quinoa",4.50);
        lista_precios.put("avena",2.21);

        System.out.println(lista_precios);


        String prod;

        do {
            System.out.println("Producto: ");
            prod = sc.nextLine();

            if (!prod.equalsIgnoreCase("fin")){
                System.out.println("Cantidad: ");
                Integer cant = sc.nextInt();

                LineaPedido lp = new LineaPedido(prod,cant);
                productos.add(lp);

                sc.nextLine();
            }



        } while(!prod.equalsIgnoreCase("fin"));

        Iterator it = productos.iterator();
        System.out.println("Producto   Precios   Cantidad   Subtotal ");
        System.out.println("--------------------------------------------");
        while (it.hasNext()) {
            LineaPedido p = (LineaPedido) it.next();
            Double precio = lista_precios.get(p.getNombre());
            System.out.println(p.getNombre()+"      "+precio+"      "+p.getCantidad()+"      "+precio*p.getCantidad());

            total += precio*p.getCantidad();
        }

        System.out.println("-----------------------------------------");
        System.out.println("TOTAL "+total);
    }

}
