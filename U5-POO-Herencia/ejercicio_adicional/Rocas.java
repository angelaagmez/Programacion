package U5.ejercicio_adicional;

public class Rocas extends Materiales implements Mezclar{
    private int dureza;

    public Rocas(String nombre, int masa, int quemar, int diluir, boolean movible, int dureza) {
        super(nombre, masa, quemar, diluir, movible);
        this.dureza = dureza;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "Rocas{" +
                "dureza=" + dureza +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", quemar=" + quemar +
                ", diluir=" + diluir +
                ", movible=" + movible +
                '}';
    }

    @Override
    public Materiales mezclarConMaterial(Materiales material) {
        if (material instanceof Mezclar){
            String nombre = this.nombre + " de " + material.getNombre();
            int masa = this.masa + material.getMasa();
            int quemar = this.quemar + material.getQuemar();
            int diluir = this.diluir + material.getDiluir();
            Rocas nuevo = new Rocas(nombre,masa,quemar,diluir,true,this.dureza);
            System.out.println("Nuevo material: "+nuevo.getNombre());
            return nuevo;
        } else {
            String nombre = this.nombre + " de " + material.getNombre();
            int masa = this.masa + material.getMasa();
            int quemar = this.quemar + material.getQuemar();
            int diluir = this.diluir + material.getDiluir();
            if (material instanceof Pico){
                Pico nuevop = new Pico(nombre,masa,quemar,diluir,true, ((Pico) material).getGrosor());
                System.out.println("Nuevo material: "+nuevop.getNombre());
                return nuevop;
            }else {
                Sierra nuevos = new Sierra(nombre,masa,quemar,diluir,true,((Sierra) material).getDiametro());
                System.out.println("Nuevo material: "+nuevos.getNombre());
                return nuevos;
            }
        }
    }

}
