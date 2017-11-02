/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "pontoparadaprevisto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pontoparadaprevisto.findAll", query = "SELECT p FROM Pontoparadaprevisto p")
    , @NamedQuery(name = "Pontoparadaprevisto.findById", query = "SELECT p FROM Pontoparadaprevisto p WHERE p.id = :id")
    , @NamedQuery(name = "Pontoparadaprevisto.findByOrdem", query = "SELECT p FROM Pontoparadaprevisto p WHERE p.ordem = :ordem")
    , @NamedQuery(name = "Pontoparadaprevisto.findByTempoParada", query = "SELECT p FROM Pontoparadaprevisto p WHERE p.tempoParada = :tempoParada")})
public class Pontoparadaprevisto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Ordem")
    private int ordem;
    @Basic(optional = false)
    @Column(name = "TempoParada")
    private double tempoParada;
    @JoinColumn(name = "DistanciaCidades", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Distanciacidades distanciaCidades;
    @JoinColumn(name = "Rota", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Rotapronta rota;

    public Pontoparadaprevisto() {
    }

    public Pontoparadaprevisto(Integer id) {
        this.id = id;
    }

    public Pontoparadaprevisto(Integer id, int ordem, double tempoParada) {
        this.id = id;
        this.ordem = ordem;
        this.tempoParada = tempoParada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public double getTempoParada() {
        return tempoParada;
    }

    public void setTempoParada(double tempoParada) {
        this.tempoParada = tempoParada;
    }

    public Distanciacidades getDistanciaCidades() {
        return distanciaCidades;
    }

    public void setDistanciaCidades(Distanciacidades distanciaCidades) {
        this.distanciaCidades = distanciaCidades;
    }

    public Rotapronta getRota() {
        return rota;
    }

    public void setRota(Rotapronta rota) {
        this.rota = rota;
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
        if (!(object instanceof Pontoparadaprevisto)) {
            return false;
        }
        Pontoparadaprevisto other = (Pontoparadaprevisto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pontoparadaprevisto[ id=" + id + " ]";
    }
    
}
