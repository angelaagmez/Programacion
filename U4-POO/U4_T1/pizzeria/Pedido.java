package U4_T1.pizzeria;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Pedido {
    Pizza[] p;
    String[] hora;
    int cantPedidos;

    public Pedido(Pizza p, String hora) {
        this.p = new Pizza[5];
        this.hora = new String[5];
        this.cantPedidos = 0;
        addPedidos(p);
    }

    public Pizza[] getP() {
        return p;
    }

    public void setP(Pizza[] p) {
        this.p = p;
    }

    public String[] getHora() {
        return hora;
    }

    public void setHora(String[] hora) {
        this.hora = hora;
    }

    public void addPedidos(Pizza p1){
        if (cantPedidos<p.length){
            p[cantPedidos] = p1;
        } else {
            p = Arrays.copyOf(p,p.length+1);
            p[p.length-1] = p1;
        }
        cantPedidos++;
    }

    public static String fecha(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);
        Date date = cal.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date1 = format1.format(date);
        return date1;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "p=" + Arrays.toString(p) +
                ", hora=" + Arrays.toString(hora) +
                ", cantPedidos=" + cantPedidos +
                '}';
    }
}
