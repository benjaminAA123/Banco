package com.iesam.bank.Presentation;

import com.iesam.bank.Domain.Cliente;
import com.iesam.bank.Domain.Hipotecas;
import com.iesam.bank.Domain.Movimientos;
import com.iesam.bank.Domain.Productos_Bancarios;

public class Main {

    public static void main(String[] args) {


        Movimientos movimientos = new Movimientos();
        System.out.print("Transacciones de cobros");
        movimientos.setImporteM("100 €");

        System.out.println("Transacciones pagos");
        movimientos.setPagos("150 €");


        Hipotecas hipotecas = new Hipotecas();
        hipotecas.setCodigo(15);
        hipotecas.setDescripcion(" Compra de una parcela en un pueblo de avila 'navaltagordo'");
        hipotecas.setFecha_InicioP("05/01/2015");
        hipotecas.setInteres("15 %");
        hipotecas.setFecha_FinP("31/12/2025");
        hipotecas.setImporteP("10.000 €");


        Cliente cliente = new Cliente();
        cliente.setNombre("Felipe");
        cliente.setApellido("DIAZ" + "Gomez");
        cliente.setDni("54894948Y");
        cliente.setPoblacion("Avila");
        cliente.setCodigo_Postal("05015");



        System.out.println("Transaccion pagos " + movimientos.getImporteM());
        System.out.println("Pagos" + movimientos.getPagos());

        System.out.println("1RA. HIPOTECA" + hipotecas.getCodigo() + "descripcion de la compra" + hipotecas.getDescripcion());
    }


}