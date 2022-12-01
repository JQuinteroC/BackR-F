package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.ProductoIngrediente;
import com.rappi2.furiosos.CDDBack.models.ProductoIngredienteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoIngredienteRepository extends JpaRepository<ProductoIngrediente, ProductoIngredienteId> {
}
