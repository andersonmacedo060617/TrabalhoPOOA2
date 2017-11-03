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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "distanciacidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distanciacidades.findAll", query = "SELECT d FROM Distanciacidades d")
    ,@NamedQuery(name = "Distanciacidades.findById", query = "SELECT d FROM Distanciacidades d WHERE d.id = :id")
    ,@NamedQuery(name = "Distanciacidades.findAllCompleta", query = "SELECT d FROM Distanciacidades d JOIN Cidade ci ON d.cidadeInicio = ci JOIN Cidade cf ON d.cidadeFim = cf")
})
public class Distanciacidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "distanciaCidades")
    private List<Pontoparadaprevisto> pontoparadaprevistoList;
    @JoinColumn(name = "CidadeFim", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cidade cidadeFim;
    @JoinColumn(name = "CidadeInicio", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cidade cidadeInicio;
    @Column(name = "Distancia")
    private Double distancia;

    public Distanciacidades() {
    }

    public Distanciacidades(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    
    

    @XmlTransient
    public List<Pontoparadaprevisto> getPontoparadaprevistoList() {
        return pontoparadaprevistoList;
    }

    public void setPontoparadaprevistoList(List<Pontoparadaprevisto> pontoparadaprevistoList) {
        this.pontoparadaprevistoList = pontoparadaprevistoList;
    }

    public Cidade getCidadeFim() {
        return cidadeFim;
    }

    public void setCidadeFim(Cidade cidadeFim) {
        this.cidadeFim = cidadeFim;
    }

    public Cidade getCidadeInicio() {
        return cidadeInicio;
    }

    public void setCidadeInicio(Cidade cidadeInicio) {
        this.cidadeInicio = cidadeInicio;
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
        if (!(object instanceof Distanciacidades)) {
            return false;
        }
        Distanciacidades other = (Distanciacidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Distanciacidades[ id=" + id + " ]";
    }
    
}
