package com.iesam.bank.Domain;

public class cliente {

    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String poblacion;
    private String codigo_Postal;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodigo_Postal() {
        return codigo_Postal;
    }

    public void setCodigo_Postal(String codigo_Postal) {
        this.codigo_Postal = codigo_Postal;
    }
}
