package com.projeto.obra.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obra {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String  nome;
    private Integer anoConstrucao;
    private String coordenacao;
    private String diretoria;
    private String outorga;
    private String titularidade;

    
    public Obra() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoConstrucao() {
        return anoConstrucao;
    }
    public void setAnoConstrucao(Integer anoConstrucao) {
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
