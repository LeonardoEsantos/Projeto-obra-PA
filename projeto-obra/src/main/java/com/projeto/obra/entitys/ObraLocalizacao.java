package com.projeto.obra.entitys;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ObraLocalizacao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private BigInteger id;
    @ManyToOne
    private Obra obraId;
    private String estado;
    private String latitude;
    private String longitude;

    
    public ObraLocalizacao() {
    }
    
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public Obra getObraId() {
        return obraId;
    }
    public void setObraId(Obra obraId) {
        this.obraId = obraId;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
