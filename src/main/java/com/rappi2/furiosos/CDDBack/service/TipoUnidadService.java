package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.TipoUnidad;
import com.rappi2.furiosos.CDDBack.repository.TipoUnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUnidadService {
    @Autowired
    private TipoUnidadRepository tipoUnidadRepository;

    public TipoUnidad create(TipoUnidad tipoUnidad) { return tipoUnidadRepository.save(tipoUnidad);}

    public TipoUnidad update(TipoUnidad tipoUnidad) { return tipoUnidadRepository.save(tipoUnidad);}

    public TipoUnidad findById(Integer id) {
        Optional<TipoUnidad> tipoUnidad = tipoUnidadRepository.findById(id);
        return tipoUnidad.orElse(null);
    }

    public List<TipoUnidad> findAll() { return tipoUnidadRepository.findAll();}
}
