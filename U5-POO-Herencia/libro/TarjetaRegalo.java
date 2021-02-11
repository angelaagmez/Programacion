package U5.libro;

public class TarjetaRegalo {
    private int numero;
    private double saldo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        numero = (int)(Math.random()*(10000+99999)-10000);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gasta(double dinero){
        if (dinero>this.saldo){
            System.out.println("No tiene suficiente saldo para gastar "+dinero);
        } else {
            this.saldo -= dinero;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        double saldoTotal;

        saldoTotal = this.saldo+t.saldo;

        this.saldo = 0;
        t.saldo = 0;

        return new TarjetaRegalo(saldoTotal);
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + numero +
                " - Saldo " + saldo ;
    }
}
