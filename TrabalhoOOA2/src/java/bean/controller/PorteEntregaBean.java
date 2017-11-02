/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.PorteEntregaDao;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "porteEntrega")
@RequestScoped
public class PorteEntregaBean {

    private List<Porteentrega> lstPortesEntrega;
    private Porteentrega porteEntrega; 

    public List<Porteentrega> getLstPortesEntrega() {
        return lstPortesEntrega;
    }

    public void setLstPortesEntrega(List<Porteentrega> lstPortesEntrega) {
        this.lstPortesEntrega = lstPortesEntrega;
    }

    public Porteentrega getPorteEntrega() {
        return porteEntrega;
    }

    public void setPorteEntrega(Porteentrega porteEntrega) {
        this.porteEntrega = porteEntrega;
    }
    
    
    /**
     * Creates a new instance of PorteEntregaBean
     */
    public PorteEntregaBean() {
        this.porteEntrega = new Porteentrega();
    }
    
    public String ListaPorteEntrega(){
        this.lstPortesEntrega = new PorteEntregaDao().findAll();
        return "/security_admin/PorteEntrega/index";
    }
    
    public String Novo(){
        return "/security_admin/PorteEntrega/novo";
    }
    
    public String Gravar(){
        new PorteEntregaDao().save(this.porteEntrega);
        return ListaPorteEntrega();
    }
    
    public String Apagar(int Id){
        this.porteEntrega = new PorteEntregaDao().findById(Id);
        if(this.porteEntrega != null){
            new PorteEntregaDao().delete(this.porteEntrega);
        }
        return ListaPorteEntrega();
    }
    
    public String Alterar(int Id){
        this.porteEntrega = new PorteEntregaDao().findById(Id);
        if(this.porteEntrega != null){
            return "/security_admin/PorteEntrega/alterar";
        }else{
            return ListaPorteEntrega();
        }
    }
    
}
