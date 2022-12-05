package com.rappi2.furiosos.CDDBack.controller;

import com.rappi2.furiosos.CDDBack.models.Menu;
import com.rappi2.furiosos.CDDBack.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public ResponseEntity<List<Menu>> findAll(){
        return new ResponseEntity<>(menuService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Menu> create(@RequestBody Menu menu) throws Exception {
        return new ResponseEntity<>(menuService.create(menu), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Menu menu) throws Exception {
        menuService.update(menu);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> findById(@PathVariable("id") String idMenu){
        return new ResponseEntity<>(menuService.findById(idMenu), HttpStatus.OK);
    }
}
