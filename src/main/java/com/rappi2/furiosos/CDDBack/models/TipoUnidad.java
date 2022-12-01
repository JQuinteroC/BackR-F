package com.rappi2.furiosos.CDDBack.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tipo_unidad")
public class TipoUnidad {
    @Id
    @Column(name = "pk_idunidad", nullable = false)
    private Integer id;

    @Column(name = "n_nombre_unidad", nullable = false, length = 50)
    private String nNombreUnidad;

    @Column(name = "n_sigla", nullable = false, length = 5)
    private String nSigla;

    @OneToMany(mappedBy = "fkIdunidad")
    private Set<Ingrediente> ingredientes = new LinkedHashSet<>();

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNNombreUnidad() {
        return nNombreUnidad;
    }

    public void setNNombreUnidad(String nNombreUnidad) {
        this.nNombreUnidad = nNombreUnidad;
    }

    public String getNSigla() {
        return nSigla;
    }

    public void setNSigla(String nSigla) {
        this.nSigla = nSigla;
    }

}