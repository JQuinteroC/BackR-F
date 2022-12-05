package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.ProductoMenu;
import com.rappi2.furiosos.CDDBack.models.ProductoMenuId;
import com.rappi2.furiosos.CDDBack.service.ProductoMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("productoMenu")
public class ProductoMenuController {
    @Autowired
    private ProductoMenuService productoMenuService;

    @GetMapping
    public ResponseEntity<List<ProductoMenu>> findAll(){
        return new ResponseEntity<>(productoMenuService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductoMenu> create(@RequestBody ProductoMenu productoMenu) throws Exception {
        return new ResponseEntity<>(productoMenuService.create(productoMenu), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody ProductoMenu productoMenu) throws Exception {
        productoMenuService.update(productoMenu);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoMenu> findById(@PathVariable("id") ProductoMenuId idProductoMenu) {
        return new ResponseEntity<>(productoMenuService.findById(idProductoMenu), HttpStatus.OK);
    }
}
