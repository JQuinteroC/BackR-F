package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {
    @Id
    @Column(name = "pk_idingrediente", nullable = false, length = 10)
    private String id;

    @Column(name = "q_unidades", nullable = false)
    private Integer qUnidades;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_idunidad", nullable = false)
    private TipoUnidad fkIdunidad;

    @Column(name = "n_nombre", nullable = false, length = 20)
    private String nNombre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQUnidades() {
        return qUnidades;
    }

    public void setQUnidades(Integer qUnidades) {
        this.qUnidades = qUnidades;
    }

    public TipoUnidad getFkIdunidad() {
        return fkIdunidad;
    }

    public void setFkIdunidad(TipoUnidad fkIdunidad) {
        this.fkIdunidad = fkIdunidad;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

}