package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @Column(name = "pk_idpedido", nullable = false, length = 50)
    private String id;

    @Column(name = "v_monto", nullable = false, length = 50)
    private String vMonto;

    @Column(name = "a_direccion", nullable = false, length = 50)
    private String aDireccion;

    @Column(name = "f_fecha", nullable = false)
    private LocalDate fFecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pk_identificador")
    private Cliente pkIdentificador;

    @OneToMany(mappedBy = "pedido")
    private Set<DetallePedido> detallePedidos = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "pedido_restaurante",
            joinColumns = @JoinColumn(name = "pk_idpedido"),
            inverseJoinColumns = @JoinColumn(name = "pk_nit"))
    private Set<Restaurante> restaurantes = new LinkedHashSet<>();

    public Set<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(Set<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
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

    public String getVMonto() {
        return vMonto;
    }

    public void setVMonto(String vMonto) {
        this.vMonto = vMonto;
    }

    public String getADireccion() {
        return aDireccion;
    }

    public void setADireccion(String aDireccion) {
        this.aDireccion = aDireccion;
    }

    public LocalDate getFFecha() {
        return fFecha;
    }

    public void setFFecha(LocalDate fFecha) {
        this.fFecha = fFecha;
    }

    public Cliente getPkIdentificador() {
        return pkIdentificador;
    }

    public void setPkIdentificador(Cliente pkIdentificador) {
        this.pkIdentificador = pkIdentificador;
    }

}