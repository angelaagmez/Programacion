package U5.ejercicio_adicional;

public class Cristal extends Materiales implements Mezclar{
    private Tipo tipo;

    public Cristal(String nombre, int masa, int quemar, int diluir, boolean movible, Tipo tipo) {
        super(nombre, masa, quemar, diluir, movible);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cristal{" +
                "tipo=" + tipo +
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
            Cristal nuevo = new Cristal(nombre,masa,quemar,diluir,true,this.tipo);
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
