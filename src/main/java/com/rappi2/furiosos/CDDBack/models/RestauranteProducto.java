package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurante_producto")
public class RestauranteProducto {
    @EmbeddedId
    private RestauranteProductoId id;

    @MapsId("pkIdproducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_idproducto", nullable = false)
    private Producto pkIdproducto;

    @MapsId("pkNit")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_nit", nullable = false)
    private Restaurante pkNit;

    public RestauranteProductoId getId() {
        return id;
    }

    public void setId(RestauranteProductoId id) {
        this.id = id;
    }

    public Producto getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(Producto pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    public Restaurante getPkNit() {
        return pkNit;
    }

    public void setPkNit(Restaurante pkNit) {
        this.pkNit = pkNit;
    }

}