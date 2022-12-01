package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "restaurante")
public class Restaurante {
    @Id
    @Column(name = "pk_nit", nullable = false)
    private Integer id;

    @Column(name = "n_nombre", nullable = false, length = 30)
    private String nNombre;

    @Column(name = "n_telefono", nullable = false)
    private Long nTelefono;

    @Column(name = "n_especialidad", nullable = false, length = 50)
    private String nEspecialidad;

    @ManyToMany
    @JoinTable(name = "pedido_restaurante",
            joinColumns = @JoinColumn(name = "pk_nit"),
            inverseJoinColumns = @JoinColumn(name = "pk_idpedido"))
    private Set<Pedido> pedidos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "pkNit")
    private Set<Menu> menus = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "restaurante_producto",
            joinColumns = @JoinColumn(name = "pk_nit"),
            inverseJoinColumns = @JoinColumn(name = "pk_idproducto"))
    private Set<Producto> productos = new LinkedHashSet<>();

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public Long getNTelefono() {
        return nTelefono;
    }

    public void setNTelefono(Long nTelefono) {
        this.nTelefono = nTelefono;
    }

    public String getNEspecialidad() {
        return nEspecialidad;
    }

    public void setNEspecialidad(String nEspecialidad) {
        this.nEspecialidad = nEspecialidad;
    }

}