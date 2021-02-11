package U5.ejercicio_adicional;

public class Metal extends Materiales implements Mezclar{
    private boolean imantable;

    public Metal(String nombre, int masa, int quemar, int diluir, boolean movible, boolean imantable) {
        super(nombre, masa, quemar, diluir, movible);
        this.imantable = imantable;
    }

    public boolean isImantable() {
        return imantable;
    }

    public void setImantable(boolean imantable) {
        this.imantable = imantable;
    }

    @Override
    public String toString() {
        return "Metal{" +
                "imantable=" + imantable +
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
            Metal nuevo = new Metal(nombre,masa,quemar,diluir,true,this.imantable);
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
