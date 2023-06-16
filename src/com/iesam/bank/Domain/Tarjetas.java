package com.iesam.bank.Domain;

public class Tarjetas extends Productos_Bancarios{

    private String fecha_Caducidad;
    private String numTarjeta;

    public String getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(String fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
