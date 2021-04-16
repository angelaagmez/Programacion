package com.abg;

import javax.xml.validation.TypeInfoProvider;
import java.util.Arrays;

public class Empresa {
    PedidosOnline[] online;
    PedidosEnTienda[] tienda;
    private int cont=0;

    public Empresa() {
        this.online = new PedidosOnline[0];
        this.tienda = new PedidosEnTienda[0];
    }

    public PedidosOnline[] getOnline() {
        return online;
    }

    public void setOnline(PedidosOnline[] online) {
        this.online = online;
    }

    public PedidosEnTienda[] getTienda() {
        return tienda;
    }

    public void setTienda(PedidosEnTienda[] tienda) {
        this.tienda = tienda;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void addPedidosTienda(PedidosEnTienda pedTienda){
        tienda = Arrays.copyOf(tienda,tienda.length+1);
        tienda[tienda.length-1] = pedTienda;
        cont++;
    }

    public void addPedidosOnline(PedidosOnline pedOnline){
        online = Arrays.copyOf(online,online.length+1);
        online[online.length-1] = pedOnline;
        cont++;
    }

    public int contadorPedidos(){
        return cont;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "online=" + Arrays.toString(online) +
                ", tienda=" + Arrays.toString(tienda) +
                '}';
    }
}
