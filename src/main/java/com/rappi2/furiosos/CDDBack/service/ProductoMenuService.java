package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.ProductoMenu;
import com.rappi2.furiosos.CDDBack.models.ProductoMenuId;
import com.rappi2.furiosos.CDDBack.repository.ProductoMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoMenuService {
    @Autowired
    private ProductoMenuRepository productoMenuRepository;

    public ProductoMenu create(ProductoMenu productoMenu){
        return productoMenuRepository.save(productoMenu);
    }

    public ProductoMenu update(ProductoMenu productoMenu) {
        return productoMenuRepository.save(productoMenu);
    }

    public ProductoMenu findById(ProductoMenuId id){
        Optional<ProductoMenu> productoMenu = productoMenuRepository.findById(id);
        return productoMenu.orElse(null);
    }

    public List<ProductoMenu> findAll(){
        return productoMenuRepository.findAll();
    }
}
