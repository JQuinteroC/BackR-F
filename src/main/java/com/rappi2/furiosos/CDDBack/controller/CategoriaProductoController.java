package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.CategoriaProducto;
import com.rappi2.furiosos.CDDBack.service.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("categoriaProducto")
public class CategoriaProductoController {
    @Autowired
    private CategoriaProductoService categoriaProductoService;

    @GetMapping
    public ResponseEntity<List<CategoriaProducto>> findAll(){
        return new ResponseEntity<>(categoriaProductoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CategoriaProducto> create(@RequestBody CategoriaProducto categoriaProducto) throws Exception {
        return new ResponseEntity<>(categoriaProductoService.create(categoriaProducto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody CategoriaProducto categoriaProducto) throws Exception {
        categoriaProductoService.update(categoriaProducto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaProducto> findById(@PathVariable("id") Integer idCategoriaProducto){
        return new ResponseEntity<>(categoriaProductoService.findById(idCategoriaProducto), HttpStatus.OK);
    }
}
