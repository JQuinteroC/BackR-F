package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido_restaurante")
public class PedidoRestaurante {
    @EmbeddedId
    private PedidoRestauranteId id;

    @MapsId("pkIdpedido")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_idpedido", nullable = false)
    private Pedido pkIdpedido;

    @MapsId("pkNit")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pk_nit", nullable = false)
    private Restaurante pkNit;

    public PedidoRestauranteId getId() {
        return id;
    }

    public void setId(PedidoRestauranteId id) {
        this.id = id;
    }

    public Pedido getPkIdpedido() {
        return pkIdpedido;
    }

    public void setPkIdpedido(Pedido pkIdpedido) {
        this.pkIdpedido = pkIdpedido;
    }

    public Restaurante getPkNit() {
        return pkNit;
    }

    public void setPkNit(Restaurante pkNit) {
        this.pkNit = pkNit;
    }

}