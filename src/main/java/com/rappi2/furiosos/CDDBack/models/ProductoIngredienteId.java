package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductoIngredienteId implements Serializable {
    private static final long serialVersionUID = -4263586073045955472L;
    @Column(name = "pk_idingrediente", nullable = false, length = 10)
    private String pkIdingrediente;

    @Column(name = "pk_idproducto", nullable = false, length = 50)
    private String pkIdproducto;

    public String getPkIdingrediente() {
        return pkIdingrediente;
    }

    public void setPkIdingrediente(String pkIdingrediente) {
        this.pkIdingrediente = pkIdingrediente;
    }

    public String getPkIdproducto() {
        return pkIdproducto;
    }

    public void setPkIdproducto(String pkIdproducto) {
        this.pkIdproducto = pkIdproducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductoIngredienteId entity = (ProductoIngredienteId) o;
        return Objects.equals(this.pkIdingrediente, entity.pkIdingrediente) &&
                Objects.equals(this.pkIdproducto, entity.pkIdproducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkIdingrediente, pkIdproducto);
    }

}