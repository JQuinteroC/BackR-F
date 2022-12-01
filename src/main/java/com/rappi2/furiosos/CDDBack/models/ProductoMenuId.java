package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductoMenuId implements Serializable {
    private static final long serialVersionUID = -1942002432487305033L;
    @Column(name = "pk_idproducto", nullable = false, length = 50)
    private String pkIdproducto;

    @Column(name = "pk_idmenu", nullable = false, length = 50)
    private String pkIdmenu;

    public String getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(String pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    public String getPkIdmenu() {
        return pkIdmenu;
    }

    public void setPkIdmenu(String pkIdmenu) {
        this.pkIdmenu = pkIdmenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductoMenuId entity = (ProductoMenuId) o;
        return Objects.equals(this.pkIdproducto, entity.pkIdproducto) &&
                Objects.equals(this.pkIdmenu, entity.pkIdmenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkIdproducto, pkIdmenu);
    }

}