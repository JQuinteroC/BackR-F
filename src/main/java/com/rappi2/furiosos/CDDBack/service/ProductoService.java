package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Producto;
import com.rappi2.furiosos.CDDBack.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto create(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto findById(String id){
        Optional<Producto> producto = productoRepository.findById(id);
        return producto.orElse(null);
    }

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }
}
