package com.iesam.bank.Domain;

public class Cuenta_Bancaria {

    private Integer idCuenta;
    private String titular;
    private String transacciones;
    private String productos_Contratados;
    private String saldo;

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public String getProductos_Contratados() {
        return productos_Contratados;
    }

    public void setProductos_Contratados(String productos_Contratados) {
        this.productos_Contratados = productos_Contratados;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
