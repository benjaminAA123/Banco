package com.iesam.bank.data;

import com.iesam.bank.Domain.Cliente;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Cliente cliente);
    void deleteCustomer(Cliente cliente);
    void updateCustomer(Cliente cliente);

    List<Cliente> getCustomers();

    Cliente finById(Integer dni);
}
