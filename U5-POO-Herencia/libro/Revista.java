package U5.libro;

import java.util.Calendar;

public class Revista extends Publicacion{
    private Integer num;

    public Revista(String ISBN, String titulo, Calendar año, Integer num) {
        super(ISBN, titulo, año);
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "num=" + num +
                ", ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                '}';
    }
}
