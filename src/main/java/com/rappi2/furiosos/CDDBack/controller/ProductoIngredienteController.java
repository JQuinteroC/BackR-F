package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.ProductoIngrediente;
import com.rappi2.furiosos.CDDBack.models.ProductoIngredienteId;
import com.rappi2.furiosos.CDDBack.service.ProductoIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("productoIngrediente")
public class ProductoIngredienteController {
    @Autowired
    private ProductoIngredienteService productoIngredienteService;

    @GetMapping
    public ResponseEntity<List<ProductoIngrediente>> findAll(){
        return new ResponseEntity<>(productoIngredienteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductoIngrediente> create(@RequestBody ProductoIngrediente productoIngrediente) throws  Exception {
        return new ResponseEntity<>(productoIngredienteService.create(productoIngrediente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody ProductoIngrediente productoIngrediente) throws Exception {
        productoIngredienteService.update(productoIngrediente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoIngrediente> findById(@PathVariable("id") ProductoIngredienteId idProductoIngrediente){
        return new ResponseEntity<>(productoIngredienteService.findById(idProductoIngrediente), HttpStatus.OK);
    }
}
