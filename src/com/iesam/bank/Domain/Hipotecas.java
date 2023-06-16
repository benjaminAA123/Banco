package com.iesam.bank.Domain;

public class Hipotecas extends Productos_Bancarios{

    private String fecha_InicioP;
    private String interes;
    private String fecha_FinP;
    private String importeP;

    public String getFecha_InicioP() {
        return fecha_InicioP;
    }

    public void setFecha_InicioP(String fecha_InicioP) {
        this.fecha_InicioP = fecha_InicioP;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getFecha_FinP() {
        return fecha_FinP;
    }

    public void setFecha_FinP(String fecha_FinP) {
        this.fecha_FinP = fecha_FinP;
    }

    public String getImporteP() {
        return importeP;
    }

    public void setImporteP(String importeP) {
        this.importeP = importeP;
    }
}
