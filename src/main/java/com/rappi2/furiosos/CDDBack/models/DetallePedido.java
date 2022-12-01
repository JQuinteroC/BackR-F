package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {
    @Id
    @Column(name = "fk_idpedido", nullable = false, length = 50)
    private String id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_idpedido", nullable = false)
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idproducto")
    private Producto fkIdproducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idmenu")
    private Menu fkIdmenu;

    @Column(name = "q_cantidad", nullable = false)
    private Integer qCantidad;

    @Column(name = "v_precio", nullable = false)
    private BigDecimal vPrecio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getFkIdproducto() {
        return fkIdproducto;
    }

    public void setFkIdproducto(Producto fkIdproducto) {
        this.fkIdproducto = fkIdproducto;
    }

    public Menu getFkIdmenu() {
        return fkIdmenu;
    }

    public void setFkIdmenu(Menu fkIdmenu) {
        this.fkIdmenu = fkIdmenu;
    }

    public Integer getQCantidad() {
        return qCantidad;
    }

    public void setQCantidad(Integer qCantidad) {
        this.qCantidad = qCantidad;
    }

    public BigDecimal getVPrecio() {
        return vPrecio;
    }

    public void setVPrecio(BigDecimal vPrecio) {
        this.vPrecio = vPrecio;
    }

}