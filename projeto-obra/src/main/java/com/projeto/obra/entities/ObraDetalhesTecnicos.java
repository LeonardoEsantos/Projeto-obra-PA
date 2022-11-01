package com.projeto.obra.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ObraDetalhesTecnicos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Obra obraID;
    @Enumerated(EnumType.STRING)
    private ObraTipo tipo;
    @Enumerated(EnumType.STRING)
    private ObraRisco risco;

    public ObraDetalhesTecnicos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Obra getObraID() {
        return obraID;
    }

    public void setObraID(Obra obraID) {
        this.obraID = obraID;
    }

    public ObraTipo getTipo() {
        return tipo;
    }

    public void setTipo(ObraTipo tipo) {
        this.tipo = tipo;
    }

    public ObraRisco getRisco() {
        return risco;
    }

    public void setRisco(ObraRisco risco) {
        this.risco = risco;
    }

    
    

}
