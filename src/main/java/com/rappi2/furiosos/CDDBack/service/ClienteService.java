package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Cliente;
import com.rappi2.furiosos.CDDBack.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente findById(Integer id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
