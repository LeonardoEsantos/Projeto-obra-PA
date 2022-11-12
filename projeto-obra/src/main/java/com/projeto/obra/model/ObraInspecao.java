package com.projeto.obra.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ObraInspecao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Obra obraId;
    @Enumerated(EnumType.STRING)
    private InspecaoFrequencia frequencia;
    private int mes;
    @Enumerated(EnumType.STRING)
    private InspecaoStatus status;
    private int prioridade;

    
    public ObraInspecao() {
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


    public void setObraId(Obra obraId) {
        this.obraId = obraId;
    }


    public InspecaoFrequencia getFrequencia() {
        return frequencia;
    }


    public void setFrequencia(InspecaoFrequencia frequencia) {
        this.frequencia = frequencia;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public InspecaoStatus getStatus() {
        return status;
    }


    public void setStatus(InspecaoStatus status) {
        this.status = status;
    }


    public int getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    
}
