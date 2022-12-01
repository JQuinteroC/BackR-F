package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

@Entity
@Table(name = "producto_ingrediente")
public class ProductoIngrediente {
    @EmbeddedId
    private ProductoIngredienteId id;

    @MapsId("pkIdproducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_idproducto", nullable = false)
    private Producto pkIdproducto;

    @Column(name = "q_cantidad", nullable = false)
    private Integer qCantidad;

    public ProductoIngredienteId getId() {
        return id;
    }

    public void setId(ProductoIngredienteId id) {
        this.id = id;
    }

    public Producto getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(Producto pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    public Integer getQCantidad() {
        return qCantidad;
    }

    public void setQCantidad(Integer qCantidad) {
        this.qCantidad = qCantidad;
    }

}