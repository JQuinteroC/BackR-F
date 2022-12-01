package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Pedido;
import com.rappi2.furiosos.CDDBack.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido create(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido update(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido findById(String id){
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElse(null);
    }

    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }
}
