package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.DetallePedido;
import com.rappi2.furiosos.CDDBack.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("detallePedido")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public ResponseEntity<List<DetallePedido>> findAll(){
        return new ResponseEntity<>(detallePedidoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DetallePedido> create(@RequestBody DetallePedido detallePedido) throws Exception {
        return new ResponseEntity<>(detallePedidoService.create(detallePedido), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody DetallePedido detallePedido) throws Exception {
        detallePedidoService.update(detallePedido);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetallePedido> findById(@PathVariable("id") String idDetallePedido){
        return new ResponseEntity<>(detallePedidoService.findById(idDetallePedido), HttpStatus.OK);
    }
}
