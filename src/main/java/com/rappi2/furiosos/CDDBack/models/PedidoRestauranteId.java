package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PedidoRestauranteId implements Serializable {
    private static final long serialVersionUID = -657587481794059628L;
    @Column(name = "pk_idpedido", nullable = false, length = 50)
    private String pkIdpedido;

    @Column(name = "pk_nit", nullable = false)
    private Integer pkNit;

    public String getPkIdpedido() {
        return pkIdpedido;
    }

    public void setPkIdpedido(String pkIdpedido) {
        this.pkIdpedido = pkIdpedido;
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
        PedidoRestauranteId entity = (PedidoRestauranteId) o;
        return Objects.equals(this.pkNit, entity.pkNit) &&
                Objects.equals(this.pkIdpedido, entity.pkIdpedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkNit, pkIdpedido);
    }

}