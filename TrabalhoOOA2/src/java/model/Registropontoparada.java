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
@Table(name = "registropontoparada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registropontoparada.findAll", query = "SELECT r FROM Registropontoparada r")
    , @NamedQuery(name = "Registropontoparada.findById", query = "SELECT r FROM Registropontoparada r WHERE r.id = :id")
    , @NamedQuery(name = "Registropontoparada.findByDataHoraChegadaPrevisto", query = "SELECT r FROM Registropontoparada r WHERE r.dataHoraChegadaPrevisto = :dataHoraChegadaPrevisto")
    , @NamedQuery(name = "Registropontoparada.findByDataHoraChegadaRealizado", query = "SELECT r FROM Registropontoparada r WHERE r.dataHoraChegadaRealizado = :dataHoraChegadaRealizado")
    , @NamedQuery(name = "Registropontoparada.findByDataHoraSaidaPrevisto", query = "SELECT r FROM Registropontoparada r WHERE r.dataHoraSaidaPrevisto = :dataHoraSaidaPrevisto")
    , @NamedQuery(name = "Registropontoparada.findByDataHoraSaidaRealizado", query = "SELECT r FROM Registropontoparada r WHERE r.dataHoraSaidaRealizado = :dataHoraSaidaRealizado")})
public class Registropontoparada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "DataHoraChegadaPrevisto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraChegadaPrevisto;
    @Column(name = "DataHoraChegadaRealizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraChegadaRealizado;
    @Column(name = "DataHoraSaidaPrevisto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraSaidaPrevisto;
    @Column(name = "DataHoraSaidaRealizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraSaidaRealizado;
    @JoinColumn(name = "RotaEntrega", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Rotaentrega rotaEntrega;

    public Registropontoparada() {
    }

    public Registropontoparada(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHoraChegadaPrevisto() {
        return dataHoraChegadaPrevisto;
    }

    public void setDataHoraChegadaPrevisto(Date dataHoraChegadaPrevisto) {
        this.dataHoraChegadaPrevisto = dataHoraChegadaPrevisto;
    }

    public Date getDataHoraChegadaRealizado() {
        return dataHoraChegadaRealizado;
    }

    public void setDataHoraChegadaRealizado(Date dataHoraChegadaRealizado) {
        this.dataHoraChegadaRealizado = dataHoraChegadaRealizado;
    }

    public Date getDataHoraSaidaPrevisto() {
        return dataHoraSaidaPrevisto;
    }

    public void setDataHoraSaidaPrevisto(Date dataHoraSaidaPrevisto) {
        this.dataHoraSaidaPrevisto = dataHoraSaidaPrevisto;
    }

    public Date getDataHoraSaidaRealizado() {
        return dataHoraSaidaRealizado;
    }

    public void setDataHoraSaidaRealizado(Date dataHoraSaidaRealizado) {
        this.dataHoraSaidaRealizado = dataHoraSaidaRealizado;
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
        if (!(object instanceof Registropontoparada)) {
            return false;
        }
        Registropontoparada other = (Registropontoparada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Registropontoparada[ id=" + id + " ]";
    }
    
}
