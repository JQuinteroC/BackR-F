package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.CategoriaProducto;
import com.rappi2.furiosos.CDDBack.repository.CategoriaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaProductoService {
    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;

    public CategoriaProducto create(CategoriaProducto categoriaProducto){
        return categoriaProductoRepository.save(categoriaProducto);
    }

    public CategoriaProducto update(CategoriaProducto categoriaProducto) {
        return categoriaProductoRepository.save(categoriaProducto);
    }

    public CategoriaProducto findById(Integer id){
        Optional<CategoriaProducto> cateogriaProducto = categoriaProductoRepository.findById(id);
        return cateogriaProducto.orElse(null);
    }

    public List<CategoriaProducto> findAll(){
        return categoriaProductoRepository.findAll();
    }
}
