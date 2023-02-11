package com.bolsadeideas.app.service;

import java.util.List;

import com.bolsadeideas.app.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    Cliente update(Long id, Cliente cliente);
    void deleteById(Long id);
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
}
