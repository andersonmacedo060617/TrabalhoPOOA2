/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "rotaentrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rotaentrega.findAll", query = "SELECT r FROM Rotaentrega r")
    , @NamedQuery(name = "Rotaentrega.findById", query = "SELECT r FROM Rotaentrega r WHERE r.id = :id")
    , @NamedQuery(name = "Rotaentrega.findByDataHoraInicio", query = "SELECT r FROM Rotaentrega r WHERE r.dataHoraInicio = :dataHoraInicio")})
public class Rotaentrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "DataHoraInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraInicio;
    @JoinColumn(name = "Rota", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Rotapronta rota;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rotaEntrega")
    private List<Entrega> entregaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rotaEntrega")
    private List<Registropontoparada> registropontoparadaList;

    public Rotaentrega() {
    }

    public Rotaentrega(Integer id) {
        this.id = id;
    }

    public Rotaentrega(Integer id, Date dataHoraInicio) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Rotapronta getRota() {
        return rota;
    }

    public void setRota(Rotapronta rota) {
        this.rota = rota;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @XmlTransient
    public List<Registropontoparada> getRegistropontoparadaList() {
        return registropontoparadaList;
    }

    public void setRegistropontoparadaList(List<Registropontoparada> registropontoparadaList) {
        this.registropontoparadaList = registropontoparadaList;
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
        if (!(object instanceof Rotaentrega)) {
            return false;
        }
        Rotaentrega other = (Rotaentrega) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rotaentrega[ id=" + id + " ]";
    }
    
}
