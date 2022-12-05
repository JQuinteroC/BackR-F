package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.Pedido;
import com.rappi2.furiosos.CDDBack.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        return new ResponseEntity<>(pedidoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido) throws Exception {
        return new ResponseEntity<>(pedidoService.create(pedido), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Pedido pedido) throws Exception {
        pedidoService.update(pedido);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable("id") String idPedido){
        return new ResponseEntity<>(pedidoService.findById(idPedido), HttpStatus.OK);
    }
}
