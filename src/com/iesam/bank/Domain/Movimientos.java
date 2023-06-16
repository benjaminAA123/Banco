package com.iesam.bank.Domain;

public class Movimientos {

    private Integer idMovimientos;
    private String descripcionM;
    private String importeM;
    private String ingresos;
    private String pagos;

    public Integer getIdMovimientos() {
        return idMovimientos;
    }

    public void setIdMovimientos(Integer idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public String getDescripcionM() {
        return descripcionM;
    }

    public void setDescripcionM(String descripcionM) {
        this.descripcionM = descripcionM;
    }

    public String getImporteM() {
        return importeM;
    }

    public void setImporteM(String importeM) {
        this.importeM = importeM;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String getPagos() {
        return pagos;
    }

    public void setPagos(String pagos) {
        this.pagos = pagos;
    }
}
