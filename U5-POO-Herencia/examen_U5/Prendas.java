package examen_U4U5;

public abstract class Prendas implements Colgar,Devolver,Doblar{
    protected double precio;
    protected String nombre;
    protected int codigo;
    protected int peso;
    protected boolean colgar;

    public Prendas(double precio, String nombre, int codigo, int peso, boolean colgar) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.peso = peso;
        this.colgar = colgar;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public boolean isColgar() {
        return colgar;
    }

    public void setColgar(boolean colgar) {
        this.colgar = colgar;
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre "+nombre+" y precio "+precio);
    }

    @Override
    public void doblar() {
        if (isColgar()){
            System.out.println("La prenda "+nombre+" no se puede doblar");
        } else {
            System.out.println("La prenda "+nombre+" se puede doblar");
        }
    }

    @Override
    public void colgar() {
        if (isColgar()){
            System.out.println("La prenda "+nombre+" esta colgada");
        }
    }


    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", peso=" + peso +
                ", colgar=" + colgar +
                '}';
    }



}
