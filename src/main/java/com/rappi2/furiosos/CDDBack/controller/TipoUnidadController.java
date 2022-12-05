package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.TipoUnidad;
import com.rappi2.furiosos.CDDBack.service.TipoUnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("tipoUnidad")
public class TipoUnidadController {
    @Autowired
    private TipoUnidadService tipoUnidadService;

    @GetMapping
    public ResponseEntity<List<TipoUnidad>> findAll(){
        return new ResponseEntity<>(tipoUnidadService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoUnidad> create(@RequestBody TipoUnidad tipoUnidad) throws Exception {
        return new ResponseEntity<>(tipoUnidadService.create(tipoUnidad), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody TipoUnidad tipoUnidad) throws Exception {
        tipoUnidadService.update(tipoUnidad);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoUnidad> findById(@PathVariable("id") Integer idTipoUnidad){
        return new ResponseEntity<>(tipoUnidadService.findById(idTipoUnidad), HttpStatus.OK);
    }
}
