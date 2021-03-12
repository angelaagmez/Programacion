import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente("Pepe","Perez",20,"12345849W");
        Cliente c2 = new Cliente("Lola","Ramos",25,"84374309T");
        Cliente c3 = new Cliente("Marta","Flores",23,"9347833U");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        System.out.println(clientes.toString());

        // Cliente c4 = clientes.remove(1);
        clientes.remove(1);

        System.out.println(clientes.toString());

        // Si tenemos elementos repetidos solo borra la primera ocurrencia

        Iterator it = clientes.iterator();
        while (it.hasNext()){
            Cliente c = (Cliente) it.next();
            System.out.println(c);
        }

        // El iterator y el for son lo mismo para recorrer el ArrayList

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
