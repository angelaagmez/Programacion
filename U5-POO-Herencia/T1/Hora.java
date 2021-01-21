package U5.T1;

public class Hora {
    protected int hora;
    protected int min;

    public Hora(int hora, int min) {
        if (hora<0 || hora>24 || min>59 || min<0){
            this.hora = 12;
            this.min = 0;
        } else {
            this.hora = hora;
            this.min = min;
        }

    }

    public Hora(){
        this(12,0);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora>=0 && hora<=23){
            this.hora = hora;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min>=0 && min<=59){
            this.min = min;
        }
    }

    public void inc(){
       min++;

       if (min>59){
           hora++;
           min=0;

           if (hora>23){
               hora = 0;
           }
       }
    }


    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", min=" + min +
                '}';
    }
}
