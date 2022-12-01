package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.PedidoRestaurante;
import com.rappi2.furiosos.CDDBack.models.PedidoRestauranteId;
import com.rappi2.furiosos.CDDBack.repository.PedidoRestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoRestauranteService {
    @Autowired
    private PedidoRestauranteRepository pedidoRestauranteRepository;

    public PedidoRestaurante create(PedidoRestaurante pedidoRestaurante){
        return pedidoRestauranteRepository.save(pedidoRestaurante);
    }

    public PedidoRestaurante update(PedidoRestaurante pedidoRestaurante) {
        return pedidoRestauranteRepository.save(pedidoRestaurante);
    }

    public PedidoRestaurante findById(PedidoRestauranteId id){
        Optional<PedidoRestaurante> pedidoRestaurante = pedidoRestauranteRepository.findById(id);
        return pedidoRestaurante.orElse(null);
    }

    public List<PedidoRestaurante> findAll(){
        return pedidoRestauranteRepository.findAll();
    }
}
