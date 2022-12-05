package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.Restaurante;
import com.rappi2.furiosos.CDDBack.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Restaurante")
public class RestauranteController {
    @Autowired
    private RestauranteService restauranteService;

    @GetMapping
    public ResponseEntity<List<Restaurante>> findAll(){
        return new ResponseEntity<>(restauranteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Restaurante> create(@RequestBody Restaurante restaurante) throws Exception {
        return new ResponseEntity<>(restauranteService.create(restaurante), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Restaurante restaurante) throws Exception {
        restauranteService.update(restaurante);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> findById(@PathVariable("id") Integer idRestaurante){
        return new ResponseEntity<>(restauranteService.findById(idRestaurante), HttpStatus.OK);
    }
}
