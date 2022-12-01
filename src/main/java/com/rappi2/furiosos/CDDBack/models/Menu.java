package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @Column(name = "pk_idmenu", nullable = false, length = 50)
    private String id;

    @Column(name = "n_nombre", nullable = false, length = 50)
    private String nNombre;

    @Column(name = "v_personalizable", nullable = false)
    private Boolean vPersonalizable = false;

    @Column(name = "i_foto")
    private byte[] iFoto;

    @Column(name = "v_precio", nullable = false)
    private BigDecimal vPrecio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pk_nit")
    private Restaurante pkNit;

    @OneToMany(mappedBy = "fkIdmenu")
    private Set<DetallePedido> detallePedidos = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "producto_menu",
            joinColumns = @JoinColumn(name = "pk_idmenu"),
            inverseJoinColumns = @JoinColumn(name = "pk_idproducto"))
    private Set<Producto> productos = new LinkedHashSet<>();

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(Set<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public Boolean getVPersonalizable() {
        return vPersonalizable;
    }

    public void setVPersonalizable(Boolean vPersonalizable) {
        this.vPersonalizable = vPersonalizable;
    }

    public byte[] getIFoto() {
        return iFoto;
    }

    public void setIFoto(byte[] iFoto) {
        this.iFoto = iFoto;
    }

    public BigDecimal getVPrecio() {
        return vPrecio;
    }

    public void setVPrecio(BigDecimal vPrecio) {
        this.vPrecio = vPrecio;
    }

    public Restaurante getPkNit() {
        return pkNit;
    }

    public void setPkNit(Restaurante pkNit) {
        this.pkNit = pkNit;
    }

}