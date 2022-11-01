package com.projeto.obra.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obra {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private BigInteger id;
    private String  nome;
    private BigInteger anoConstrucao;
    private String coordenacao;
    private String diretoria;
    private String outorga;
    private String titularidade;

    
    public Obra() {
    }

    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigInteger getAnoConstrucao() {
        return anoConstrucao;
    }
    public void setAnoConstrucao(BigInteger anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }
    public String getCoordenacao() {
        return coordenacao;
    }
    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }
    public String getDiretoria() {
        return diretoria;
    }
    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }
    public String getOutorga() {
        return outorga;
    }
    public void setOutorga(String outorga) {
        this.outorga = outorga;
    }
    public String getTitularidade() {
        return titularidade;
    }
    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }

    

}
