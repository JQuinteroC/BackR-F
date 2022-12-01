package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.PedidoRestaurante;
import com.rappi2.furiosos.CDDBack.models.PedidoRestauranteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRestauranteRepository extends JpaRepository<PedidoRestaurante, PedidoRestauranteId> {
}
