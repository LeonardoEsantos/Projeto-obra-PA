package com.projeto.obra.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ObraDetalhesTecnicos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Obra obraId;
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

    public Obra getObraId() {
        return obraId;
    }

    public void setObraId(Obra obraID) {
        this.obraId = obraID;
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
