package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.CategoriaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Integer> {
}
