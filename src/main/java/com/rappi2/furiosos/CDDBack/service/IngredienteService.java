package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Ingrediente;
import com.rappi2.furiosos.CDDBack.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente create(Ingrediente ingrediente){ return ingredienteRepository.save(ingrediente); }

    public Ingrediente update(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    public Ingrediente findById(String id){
        Optional<Ingrediente> ingrediente = ingredienteRepository.findById(id);
        return ingrediente.orElse(null);
    }

    public List<Ingrediente> findAll(){
        return ingredienteRepository.findAll();
    }
}
