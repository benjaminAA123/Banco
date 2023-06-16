package com.iesam.bank.Domain;

public class Empleados {

    private String dni;
    private String nombre;
    private String apellido;
    private String num_SegSocial;

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

    public String getNum_SegSocial() {
        return num_SegSocial;
    }

    public void setNum_SegSocial(String num_SegSocial) {
        this.num_SegSocial = num_SegSocial;
    }
}
