package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, String> {
}
