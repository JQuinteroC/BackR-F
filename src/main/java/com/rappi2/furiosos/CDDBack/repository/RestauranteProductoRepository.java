package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.RestauranteProducto;
import com.rappi2.furiosos.CDDBack.models.RestauranteProductoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteProductoRepository extends JpaRepository<RestauranteProducto, RestauranteProductoId> {
}
