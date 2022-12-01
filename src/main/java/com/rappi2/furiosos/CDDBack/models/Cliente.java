package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "pk_identificador", nullable = false)
    private Integer id;

    @Column(name = "n_nombre", nullable = false, length = 50)
    private String nNombre;

    @Column(name = "n_celular", nullable = false)
    private Long nCelular;

    @Column(name = "n_tipo", nullable = false, length = 20)
    private String nTipo;

    @Column(name = "p_contrasenia", nullable = false, length = 50)
    private String pContrasenia;

    @OneToMany(mappedBy = "pkIdentificador")
    private Set<Pedido> pedidos = new LinkedHashSet<>();

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

    public Long getNCelular() {
        return nCelular;
    }

    public void setNCelular(Long nCelular) {
        this.nCelular = nCelular;
    }

    public String getNTipo() {
        return nTipo;
    }

    public void setNTipo(String nTipo) {
        this.nTipo = nTipo;
    }

    public String getPContrasenia() {
        return pContrasenia;
    }

    public void setPContrasenia(String pContrasenia) {
        this.pContrasenia = pContrasenia;
    }

}