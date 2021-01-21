package U5.T1;

public class Hora12 extends Hora{
    String franja;

    public Hora12(int hora, int min) {
       /*
        if (hora>12 || hora<0 || min<0 || min>59){
            this.hora = 12;
            this.min = 0;
            this.franja = "pm";
        } else {
            this.hora = hora;
            this.min = min;
            this.franja = franja;
        }
        */
        super(hora,min);
        setFormato();
    }

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }

    private void setFormato(){
        if (hora>12){
            hora -= 12;
            franja = "pm";
        } else {
            franja = "am";
        }
    }

    @Override
    public void setHora(int hora) {
        if (hora>=0 && hora<=12){
            this.hora = hora;
        }
    }

    @Override
    public void inc() {
        min++;
        if (min>59){
            hora++;
            min=0;
            if (hora>11){
                if (franja.equals("am")){
                   if (hora==12){
                       franja = "pm";
                   }
                } else {
                    if (hora==13){
                        hora=1;
                    } else if (hora==12){
                        hora=0;
                        franja="am";
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "franja='" + franja + '\'' +
                ", hora=" + hora +
                ", min=" + min +
                '}';
    }
}
