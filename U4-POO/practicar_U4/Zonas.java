package practicar_U4;

public class Zonas {
    int entradas;
    String nombreZona;
    int entradasVendidas;

    public Zonas(int entradas, String nombreZona, int entradasVendidas) {
        this.entradas = entradas;
        this.nombreZona = nombreZona;
        this.entradasVendidas = entradasVendidas;
    }

    public Zonas(int entradas, String nombreZona) {
        this.entradas = entradas;
        this.nombreZona = nombreZona;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public void venderEntradas(int cantidad){
        if (cantidad>0 && cantidad<=mostrarEntradasLibres()){
            this.entradasVendidas += cantidad;
            System.out.println("Su compra se ha realizado correctamente");
        } else {
            System.out.println("No disponemos de esa cantidad de entradas");
        }
    }

    public int mostrarEntradasLibres(){
        return entradas-entradasVendidas;
    }


    @Override
    public String toString() {
        return "Zonas{" +
                "entradas=" + entradas +
                ", nombreZona='" + nombreZona + '\'' +
                ", entradasVendidas=" + entradasVendidas +
                ", entradasDisponibles=" + mostrarEntradasLibres() +
                '}';
    }
}
