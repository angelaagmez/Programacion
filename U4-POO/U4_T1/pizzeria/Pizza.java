package U4_T1.pizzeria;

import java.util.Arrays;

public class Pizza {
    Ingrediente[] ingr;
    Size tam;
    int ingredientesMax;

    public Pizza(Ingrediente ingrediente) {
        this.ingredientesMax = 3;
        this.ingr = new Ingrediente[0];
        this.ingr = Arrays.copyOf(ingr,ingr.length+1);
        this.ingr[ingr.length-1] = ingrediente;
        this.tam = Size.FAMILIAR;
    }

    public Pizza(Ingrediente ingrediente, Size tam) {
        this.ingredientesMax = 3;
        this.ingr = new Ingrediente[0];
        this.ingr = Arrays.copyOf(ingr,ingr.length+1);
        this.ingr[ingr.length-1] = ingrediente;
        this.tam = tam;
    }

    public Ingrediente[] getIngr() {
        return ingr;
    }

    public void setIngr(Ingrediente[] ingr) {
        this.ingr = ingr;
    }

    public Size getTam() {
        return tam;
    }

    public void setTam(Size tam) {
        this.tam = tam;
    }

    public int cuantosIngredientes(){
        return ingr.length;
    }

    public boolean addIngrediente(Ingrediente ingrediente){
        if (cuantosIngredientes()<ingredientesMax){
            ingr = Arrays.copyOf(ingr,ingr.length+1);
            ingr[ingr.length-1] = ingrediente;
            return true;
        }
        return false;
    }

    public boolean addIngrediente(String nombre, int calorias){
        if (cuantosIngredientes()<ingredientesMax){
            Ingrediente ingrediente = new Ingrediente(nombre,calorias);
            ingr = Arrays.copyOf(ingr,ingr.length+1);
            ingr[ingr.length-1] = ingrediente;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingr=" + Arrays.toString(ingr) +
                ", tam=" + tam +
                ", ingredientesMax=" + ingredientesMax +
                '}';
    }
}
