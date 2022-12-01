package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Restaurante;
import com.rappi2.furiosos.CDDBack.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante create(Restaurante restaurante){
        return restauranteRepository.save(restaurante);
    }

    public Restaurante update(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public Restaurante findById(Integer id){
        Optional<Restaurante> cliente = restauranteRepository.findById(id);
        return cliente.orElse(null);
    }

    public List<Restaurante> findAll(){
        return restauranteRepository.findAll();
    }
}
