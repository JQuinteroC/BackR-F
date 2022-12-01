package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.RestauranteProducto;
import com.rappi2.furiosos.CDDBack.models.RestauranteProductoId;
import com.rappi2.furiosos.CDDBack.repository.RestauranteProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteProductoService {
    @Autowired
    private RestauranteProductoRepository restauranteProductoRepository;

    public RestauranteProducto create(RestauranteProducto restauranteProducto){
        return restauranteProductoRepository.save(restauranteProducto);
    }

    public RestauranteProducto update(RestauranteProducto restauranteProducto) {
        return restauranteProductoRepository.save(restauranteProducto);
    }

    public RestauranteProducto findById(RestauranteProductoId id){
        Optional<RestauranteProducto> restauranteProducto = restauranteProductoRepository.findById(id);
        return restauranteProducto.orElse(null);
    }

    public List<RestauranteProducto> findAll(){
        return restauranteProductoRepository.findAll();
    }
}
