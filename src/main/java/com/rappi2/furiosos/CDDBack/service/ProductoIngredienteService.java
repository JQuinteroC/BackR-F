package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.ProductoIngrediente;
import com.rappi2.furiosos.CDDBack.models.ProductoIngredienteId;
import com.rappi2.furiosos.CDDBack.repository.ProductoIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoIngredienteService {
    @Autowired
    private ProductoIngredienteRepository productoIngredienteRepository;

    public ProductoIngrediente create(ProductoIngrediente productoIngrediente){
        return productoIngredienteRepository.save(productoIngrediente);
    }

    public ProductoIngrediente update(ProductoIngrediente productoIngrediente) {
        return productoIngredienteRepository.save(productoIngrediente);
    }

    public ProductoIngrediente findById(ProductoIngredienteId id){
        Optional<ProductoIngrediente> productoIngrediente = productoIngredienteRepository.findById(id);
        return productoIngrediente.orElse(null);
    }

    public List<ProductoIngrediente> findAll(){
        return productoIngredienteRepository.findAll();
    }
}
