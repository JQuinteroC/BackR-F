package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cateogria_producto")
public class CategoriaProducto {
    @Id
    @Column(name = "pk_idcategoria", nullable = false)
    private Integer id;

    @Column(name = "n_nombre", nullable = false, length = 50)
    private String nNombre;

    @OneToMany(mappedBy = "fkIdcategoria")
    private Set<Producto> productos = new LinkedHashSet<>();

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

}