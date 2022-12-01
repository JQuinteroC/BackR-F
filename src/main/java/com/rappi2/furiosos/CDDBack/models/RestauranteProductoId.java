package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RestauranteProductoId implements Serializable {
    private static final long serialVersionUID = 7949056962807215881L;
    @Column(name = "pk_idproducto", nullable = false, length = 50)
    private String pkIdproducto;

    @Column(name = "pk_nit", nullable = false)
    private Integer pkNit;

    public String getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(String pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    public Integer getPkNit() {
        return pkNit;
    }

    public void setPkNit(Integer pkNit) {
        this.pkNit = pkNit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RestauranteProductoId entity = (RestauranteProductoId) o;
        return Objects.equals(this.pkIdproducto, entity.pkIdproducto) &&
                Objects.equals(this.pkNit, entity.pkNit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkIdproducto, pkNit);
    }

}