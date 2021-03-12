package U7_T6;

import javax.sound.sampled.Line;
import java.util.*;

public class Supermercado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Double> lista_precios = new HashMap<String,Double>();
        List<LineaPedido> productos = new LinkedList<LineaPedido>();


        lista_precios.put("tomate",1.59);
        lista_precios.put("quinoa",4.50);
        lista_precios.put("avena",2.21);

        String prod;

        do {
            System.out.println("Producto:");
            prod = sc.nextLine();

            if (!prod.equalsIgnoreCase("fin")){
                System.out.println("Cantidad: ");
                Integer cant = sc.nextInt();

                LineaPedido lp = new LineaPedido(prod,cant);

                if (productos.contains(lp)){
                    LineaPedido aux = new LineaPedido(prod,0);
                    LineaPedido lp1 = productos.get(productos.indexOf(aux));
                    lp1.setCantidad(lp1.getCantidad()+cant);
                } else {
                    productos.add(lp);
                }
                sc.nextLine();
            }

        } while (!prod.equalsIgnoreCase("fin"));

        System.out.println("Introduce un codigo de descuento (INTRO si no tiene ninguno)");
        String cod = sc.nextLine();


        if (cod.equalsIgnoreCase("ECODTO")){
            Double total = 0.0;
            Double descuento = 0.0;

            Iterator it = productos.iterator();
            System.out.println("Producto  Precio  Cantidad  Subtotal");
            System.out.println("--------------------------------------------");
            while (it.hasNext()){
                LineaPedido p = (LineaPedido) it.next();
                Double precio = lista_precios.get(p.getNombre());
                System.out.println(p.getNombre()+"      "+precio+"      "+p.getCantidad()+"      "+precio*p.getCantidad());
                total += precio*p.getCantidad();
                descuento = total*0.1;
            }
            System.out.println("---------------------------------");
            System.out.println("DESCUENTO: "+descuento);
            System.out.println("---------------------------------");
            System.out.println("TOTAL: "+(total-descuento));
        } else {
            Double total = 0.0;

            Iterator it = productos.iterator();
            System.out.println("Producto  Precio  Cantidad  Subtotal");
            System.out.println("--------------------------------------------");
            while (it.hasNext()){
                LineaPedido p = (LineaPedido) it.next();
                Double precio = lista_precios.get(p.getNombre());
                System.out.println(p.getNombre()+"      "+precio+"      "+p.getCantidad()+"      "+precio*p.getCantidad());
                total += precio*p.getCantidad();
            }
            System.out.println("---------------------------------");
            System.out.println("TOTAL: "+total);
        }
    }
}
