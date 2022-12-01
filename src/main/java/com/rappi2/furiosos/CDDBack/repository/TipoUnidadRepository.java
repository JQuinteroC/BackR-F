package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.TipoUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUnidadRepository extends JpaRepository<TipoUnidad, Integer> {
}
