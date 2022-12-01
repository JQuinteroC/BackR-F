package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @Column(name = "pk_idproducto", nullable = false, length = 50)
    private String id;

    @Column(name = "n_nombre", nullable = false, length = 50)
    private String nNombre;

    @Column(name = "q_unidades", nullable = false)
    private Integer qUnidades;

    @Column(name = "i_personalizable", nullable = false)
    private Boolean iPersonalizable = false;

    @Column(name = "v_precio", nullable = false)
    private BigDecimal vPrecio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_idcategoria", nullable = false)
    private CateogriaProducto fkIdcategoria;

    @Column(name = "i_foto")
    private byte[] iFoto;

    @OneToMany(mappedBy = "pkIdproducto")
    private Set<ProductoIngrediente> productoIngredientes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fkIdproducto")
    private Set<DetallePedido> detallePedidos = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "producto_menu",
            joinColumns = @JoinColumn(name = "pk_idproducto"),
            inverseJoinColumns = @JoinColumn(name = "pk_idmenu"))
    private Set<Menu> menus = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "restaurante_producto",
            joinColumns = @JoinColumn(name = "pk_idproducto"),
            inverseJoinColumns = @JoinColumn(name = "pk_nit"))
    private Set<Restaurante> restaurantes = new LinkedHashSet<>();

    public Set<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(Set<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public Set<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(Set<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    public Set<ProductoIngrediente> getProductoIngredientes() {
        return productoIngredientes;
    }

    public void setProductoIngredientes(Set<ProductoIngrediente> productoIngredientes) {
        this.productoIngredientes = productoIngredientes;
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

    public Integer getQUnidades() {
        return qUnidades;
    }

    public void setQUnidades(Integer qUnidades) {
        this.qUnidades = qUnidades;
    }

    public Boolean getIPersonalizable() {
        return iPersonalizable;
    }

    public void setIPersonalizable(Boolean iPersonalizable) {
        this.iPersonalizable = iPersonalizable;
    }

    public BigDecimal getVPrecio() {
        return vPrecio;
    }

    public void setVPrecio(BigDecimal vPrecio) {
        this.vPrecio = vPrecio;
    }

    public CateogriaProducto getFkIdcategoria() {
        return fkIdcategoria;
    }

    public void setFkIdcategoria(CateogriaProducto fkIdcategoria) {
        this.fkIdcategoria = fkIdcategoria;
    }

    public byte[] getIFoto() {
        return iFoto;
    }

    public void setIFoto(byte[] iFoto) {
        this.iFoto = iFoto;
    }

}