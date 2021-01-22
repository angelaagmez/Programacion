package Bonilla_Gomez_U4_T1_Entrega;

import java.util.Calendar;

public class Empleado {
    private String nombreCompleto;
    private String nss;
    private String tlf;
    private String fecha;
    private Tipo tipo;
    private static int contEmpleado=0;

    public Empleado(String nombreCompleto, String nss, String tlf, Tipo tipo) {
        this.nombreCompleto = nombreCompleto;
        this.nss = nss;
        this.tlf = tlf;
        this.fecha = fechaEntrada();
        this.tipo = tipo;
        contEmpleado++;
    }

    public Empleado(String nombreCompleto, String nss, String tlf) {
        this.nombreCompleto = nombreCompleto;
        this.nss = nss;
        this.tlf = tlf;
        this.fecha = fechaEntrada();
        this.tipo = Tipo.TECNICO;
        contEmpleado++;
    }

    public String fechaEntrada(){
        Calendar c = Calendar.getInstance();
        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        return  dia + "/" + mes+1 +"/" + annio;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static int getContEmpleado() {
        return contEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", nss='" + nss + '\'' +
                ", tlf='" + tlf + '\'' +
                ", fecha=" + fecha +
                ", tipo=" + tipo +
                '}';
    }



}
