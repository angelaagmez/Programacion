package U5.T1;

public class HoraExacta extends Hora{
    private Integer segundos;

    public HoraExacta(int hora, int min, Integer segundos) {
        super(hora, min);
        if (segundos<0 || segundos>59){
            this.segundos = 0;
        } else{
            this.segundos = segundos;
        }
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        if (segundos<0 || segundos>59){
            this.segundos = 0;
        } else{
            this.segundos = segundos;
        }
    }

    @Override
    public void inc(){
        segundos++;
        if (segundos>59){
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return "HoraExacta{" +
                "segundos=" + segundos +
                ", hora=" + hora +
                ", min=" + min +
                '}';
    }
}
