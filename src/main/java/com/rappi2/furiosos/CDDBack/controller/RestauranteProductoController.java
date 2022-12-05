package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.RestauranteProducto;
import com.rappi2.furiosos.CDDBack.models.RestauranteProductoId;
import com.rappi2.furiosos.CDDBack.service.RestauranteProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("restauranteProducto")
public class RestauranteProductoController {
    @Autowired
    private RestauranteProductoService restauranteProductoService;

    @GetMapping
    public ResponseEntity<List<RestauranteProducto>> findAll(){
        return new ResponseEntity<>(restauranteProductoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RestauranteProducto> create(@RequestBody RestauranteProducto restauranteProducto) throws Exception {
        return new ResponseEntity<>(restauranteProductoService.create(restauranteProducto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody RestauranteProducto restauranteProducto) throws Exception {
        restauranteProductoService.update(restauranteProducto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestauranteProducto> findById(@PathVariable("id") RestauranteProductoId idRestauranteProducto) {
        return new ResponseEntity<>(restauranteProductoService.findById(idRestauranteProducto), HttpStatus.OK);
    }
}
