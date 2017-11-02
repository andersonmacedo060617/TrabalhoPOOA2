/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findById", query = "SELECT e FROM Entrega e WHERE e.id = :id")
    , @NamedQuery(name = "Entrega.findByValor", query = "SELECT e FROM Entrega e WHERE e.valor = :valor")
    , @NamedQuery(name = "Entrega.findByDataContratacao", query = "SELECT e FROM Entrega e WHERE e.dataContratacao = :dataContratacao")
    , @NamedQuery(name = "Entrega.findByStatus", query = "SELECT e FROM Entrega e WHERE e.status = :status")
    , @NamedQuery(name = "Entrega.findByPesoMercadoria", query = "SELECT e FROM Entrega e WHERE e.pesoMercadoria = :pesoMercadoria")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Valor")
    private Double valor;
    @Basic(optional = false)
    @Column(name = "DataContratacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataContratacao;
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
    @Basic(optional = false)
    @Column(name = "PesoMercadoria")
    private double pesoMercadoria;
    @JoinColumn(name = "Cliente", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "Motorista", referencedColumnName = "Id")
    @ManyToOne
    private Motorista motorista;
    @JoinColumn(name = "PorteEntrega", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Porteentrega porteEntrega;
    @JoinColumn(name = "RotaEntrega", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Rotaentrega rotaEntrega;

    public Entrega() {
    }

    public Entrega(Integer id) {
        this.id = id;
    }

    public Entrega(Integer id, Date dataContratacao, int status, double pesoMercadoria) {
        this.id = id;
        this.dataContratacao = dataContratacao;
        this.status = status;
        this.pesoMercadoria = pesoMercadoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getPesoMercadoria() {
        return pesoMercadoria;
    }

    public void setPesoMercadoria(double pesoMercadoria) {
        this.pesoMercadoria = pesoMercadoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Porteentrega getPorteEntrega() {
        return porteEntrega;
    }

    public void setPorteEntrega(Porteentrega porteEntrega) {
        this.porteEntrega = porteEntrega;
    }

    public Rotaentrega getRotaEntrega() {
        return rotaEntrega;
    }

    public void setRotaEntrega(Rotaentrega rotaEntrega) {
        this.rotaEntrega = rotaEntrega;
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
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Entrega[ id=" + id + " ]";
    }
    
}
