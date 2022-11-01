package com.projeto.obra.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inspecao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private ObraInspecao obraInspecaoId;
    private Date data;
    private String observacoes;
    
    public Inspecao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ObraInspecao getObraInspecaoId() {
        return obraInspecaoId;
    }

    public void setObraInspecaoId(ObraInspecao obraInspecaoId) {
        this.obraInspecaoId = obraInspecaoId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
