package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

@Entity
@Table(name = "producto_menu")
public class ProductoMenu {
    @EmbeddedId
    private ProductoMenuId id;

    @MapsId("pkIdproducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_idproducto", nullable = false)
    private Producto pkIdproducto;

    @MapsId("pkIdmenu")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_idmenu", nullable = false)
    private Menu pkIdmenu;

    public ProductoMenuId getId() {
        return id;
    }

    public void setId(ProductoMenuId id) {
        this.id = id;
    }

    public Producto getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(Producto pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    public Menu getPkIdmenu() {
        return pkIdmenu;
    }

    public void setPkIdmenu(Menu pkIdmenu) {
        this.pkIdmenu = pkIdmenu;
    }

}