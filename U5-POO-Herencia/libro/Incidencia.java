package U5.libro;

public class Incidencia {
    private int codigo;
    private String estado;
    private Integer puesto;
    private String problema;
    static int pendientes = 0;
    static int generarCodigo = 1;

    public Incidencia(Integer puesto, String problema) {
        codigo = generarCodigo;
        generarCodigo++;
        this.estado = "Pendiente";
        this.puesto = puesto;
        this.problema = problema;
        pendientes++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public static int getGenerarCodigo() {
        return generarCodigo;
    }

    public static void setGenerarCodigo(int generarCodigo) {
        Incidencia.generarCodigo = generarCodigo;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public void resuelve(String solucion){
        this.estado = "Resuelta";
        pendientes--;
        System.out.println(toString()+" - "+solucion);
    }


    @Override
    public String toString() {
        return "Incidencia " + codigo +
                ", Puesto: " + puesto +
                ", - " + problema + '\'' +
                " - " + estado + '\'' +
                ' ';
    }
}
