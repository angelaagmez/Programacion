package U4_T1;

public class Calendario {
    int dia;
    int mes;
    int anyo;

    public Calendario(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public void incrementarDia(int cantidad){
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
            if (cantidad+this.dia <= 30) {
                this.dia += cantidad;
            } else {
                this.mes++;
                this.dia = this.dia+cantidad-30;
            }
        } else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 ||
        this.mes == 10 || this.mes == 12){
            if (cantidad+this.dia <= 31) {
                this.dia += cantidad;
            } else {
                this.mes++;
                if (this.mes == 13) {
                    this.anyo++;
                    this.mes = 1;
                }
                this.dia = this.dia+cantidad-31;
            }
        } else if (this.mes == 2 && anyo%4 == 0) {
            if (cantidad+this.dia <= 29) {
                this.dia += cantidad;
            } else {
                this.mes++;
                this.dia = this.dia+cantidad-29;
            }
        } else {
            if (cantidad+this.dia <= 28) {
                this.dia += cantidad;
            } else {
                this.mes++;
                this.dia = this.dia+cantidad-28;
            }
        }

    }

    public void incrementarMes(int cantidad) {
           if (mes+cantidad<=12){
               this.mes += cantidad;
           } else {
               this.anyo++;
               this.mes = this.mes+cantidad-12;
           }
    }

    public void incrementarAnyo(int cantidad){
            this.anyo += cantidad;

    }

    public void mostrar(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.anyo);
    }

        public boolean iguales(Calendario otraFecha){
        if (this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
            return true;
        } else {
            return false;
        }
    }

}
