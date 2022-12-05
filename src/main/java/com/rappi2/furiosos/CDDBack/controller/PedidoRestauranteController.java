package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.PedidoRestaurante;
import com.rappi2.furiosos.CDDBack.models.PedidoRestauranteId;
import com.rappi2.furiosos.CDDBack.service.PedidoRestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("pedidoRestaurante")
public class PedidoRestauranteController {
    @Autowired
    private PedidoRestauranteService pedidoRestauranteService;

    @GetMapping
    public ResponseEntity<List<PedidoRestaurante>> findAll(){
        return new ResponseEntity<>(pedidoRestauranteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PedidoRestaurante> create(@RequestBody PedidoRestaurante pedidoRestaurante) throws Exception {
        return new ResponseEntity<>(pedidoRestauranteService.create(pedidoRestaurante), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody PedidoRestaurante pedidoRestaurante) throws Exception {
        pedidoRestauranteService.update(pedidoRestaurante);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoRestaurante> findById(@PathVariable("id") PedidoRestauranteId idTipoUnidad){
        return new ResponseEntity<>(pedidoRestauranteService.findById(idTipoUnidad), HttpStatus.OK);
    }
}
