package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.Ingrediente;
import com.rappi2.furiosos.CDDBack.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ingrediente")
public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping
    public ResponseEntity<List<Ingrediente>> findAll(){
        return new ResponseEntity<>(ingredienteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingrediente> create(@RequestBody Ingrediente ingrediente) throws Exception {
        return new ResponseEntity<>(ingredienteService.create(ingrediente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Ingrediente ingrediente) throws Exception {
        ingredienteService.update(ingrediente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingrediente> findById(@PathVariable("id") String idIngrediente){
        return new ResponseEntity<>(ingredienteService.findById(idIngrediente), HttpStatus.OK);
    }
}
