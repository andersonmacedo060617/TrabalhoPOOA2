/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "porteentrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Porteentrega.findAll", query = "SELECT p FROM Porteentrega p")
    , @NamedQuery(name = "Porteentrega.findById", query = "SELECT p FROM Porteentrega p WHERE p.id = :id")
    , @NamedQuery(name = "Porteentrega.findByDescricao", query = "SELECT p FROM Porteentrega p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "Porteentrega.findByTipoVeiculo", query = "SELECT p FROM Porteentrega p WHERE p.tipoVeiculo = :tipoVeiculo")
    , @NamedQuery(name = "Porteentrega.findByValorKm", query = "SELECT p FROM Porteentrega p WHERE p.valorKm = :valorKm")
    , @NamedQuery(name = "Porteentrega.findByPesoLimite", query = "SELECT p FROM Porteentrega p WHERE p.pesoLimite = :pesoLimite")
    , @NamedQuery(name = "Porteentrega.findByTempoPorKm", query = "SELECT p FROM Porteentrega p WHERE p.tempoPorKm = :tempoPorKm")})
public class Porteentrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "TipoVeiculo")
    private String tipoVeiculo;
    @Basic(optional = false)
    @Column(name = "ValorKm")
    private double valorKm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PesoLimite")
    private Double pesoLimite;
    @Basic(optional = false)
    @Column(name = "TempoPorKm")
    private double tempoPorKm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "porteEntrega")
    private List<Entrega> entregaList;

    public Porteentrega() {
    }

    public Porteentrega(Integer id) {
        this.id = id;
    }

    public Porteentrega(Integer id, String descricao, String tipoVeiculo, double valorKm, double tempoPorKm) {
        this.id = id;
        this.descricao = descricao;
        this.tipoVeiculo = tipoVeiculo;
        this.valorKm = valorKm;
        this.tempoPorKm = tempoPorKm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }

    public Double getPesoLimite() {
        return pesoLimite;
    }

    public void setPesoLimite(Double pesoLimite) {
        this.pesoLimite = pesoLimite;
    }

    public double getTempoPorKm() {
        return tempoPorKm;
    }

    public void setTempoPorKm(double tempoPorKm) {
        this.tempoPorKm = tempoPorKm;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Porteentrega)) {
            return false;
        }
        Porteentrega other = (Porteentrega) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Porteentrega[ id=" + id + " ]";
    }
    
}
