package U5.T1;

public class Main_Instrumentos {
    public static void main(String[] args) {
        Piano p = new Piano();
        p.add(Notas.MI);
        p.add(Notas.DO);
        p.add(Notas.FA);
        p.add(Notas.SOL);
        p.add(Notas.RE);
        p.interpretar();

        System.out.println("");

        Campana c = new Campana();
        c.add(Notas.SOL);
        c.add(Notas.SI);
        c.add(Notas.DO);
        c.add(Notas.FA);
        c.add(Notas.SOL);
        c.interpretar();
    }
}
