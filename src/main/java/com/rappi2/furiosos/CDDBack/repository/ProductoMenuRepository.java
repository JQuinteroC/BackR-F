package com.rappi2.furiosos.CDDBack.repository;

import com.rappi2.furiosos.CDDBack.models.ProductoMenu;
import com.rappi2.furiosos.CDDBack.models.ProductoMenuId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoMenuRepository extends JpaRepository<ProductoMenu, ProductoMenuId> {
}
