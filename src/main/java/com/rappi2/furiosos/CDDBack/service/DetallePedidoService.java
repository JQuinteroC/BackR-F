package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.DetallePedido;
import com.rappi2.furiosos.CDDBack.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DetallePedidoService {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedido create(DetallePedido detallePedido){ return detallePedidoRepository.save(detallePedido); }

    public DetallePedido update(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    public DetallePedido findById(String id){
        Optional<DetallePedido> detallePedido = detallePedidoRepository.findById(id);
        return detallePedido.orElse(null);
    }

    public List<DetallePedido> findAll(){
        return detallePedidoRepository.findAll();
    }
}
