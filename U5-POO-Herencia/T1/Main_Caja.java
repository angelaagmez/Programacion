package U5.T1;

public class Main_Caja {
    public static void main(String[] args) {
        Caja c = new Caja(50,50,50,Unidades.M);
        Caja c2 = new Caja(50,50,50,Unidades.CM);

        c.setEtiqueta(new Etiqueta("Pepe", "Perez","Aqui"));

        System.out.println(c);
        System.out.println(c2);
        

    }
}
