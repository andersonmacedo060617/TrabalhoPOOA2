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
@Table(name = "rotapronta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rotapronta.findAll", query = "SELECT r FROM Rotapronta r JOIN Cidade co "
            + "ON r.cidadeOrigem = co JOIN Cidade cd on r.cidadeDestino = cd")
    , @NamedQuery(name = "Rotapronta.findById", query = "SELECT r FROM Rotapronta r WHERE r.id = :id")
    , @NamedQuery(name = "Rotapronta.findByDescricao", query = "SELECT r FROM Rotapronta r WHERE r.descricao = :descricao")})
public class Rotapronta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Descricao")
    private String descricao;
    @JoinColumn(name = "CidadeDestino", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cidade cidadeDestino;
    @JoinColumn(name = "CidadeOrigem", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cidade cidadeOrigem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rota")
    private List<Pontoparadaprevisto> pontoparadaprevistoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rota")
    private List<Rotaentrega> rotaentregaList;

    public Rotapronta() {
    }

    public Rotapronta(Integer id) {
        this.id = id;
    }

    public Rotapronta(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    @XmlTransient
    public List<Pontoparadaprevisto> getPontoparadaprevistoList() {
        return pontoparadaprevistoList;
    }

    public void setPontoparadaprevistoList(List<Pontoparadaprevisto> pontoparadaprevistoList) {
        this.pontoparadaprevistoList = pontoparadaprevistoList;
    }

    @XmlTransient
    public List<Rotaentrega> getRotaentregaList() {
        return rotaentregaList;
    }

    public void setRotaentregaList(List<Rotaentrega> rotaentregaList) {
        this.rotaentregaList = rotaentregaList;
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
        if (!(object instanceof Rotapronta)) {
            return false;
        }
        Rotapronta other = (Rotapronta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rotapronta[ id=" + id + " ]";
    }
    
    public boolean RotaOrigemDestinoValido(){
        return false;
    }
    
}
