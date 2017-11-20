/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.CidadeDao;
import dao.model.DistanciaCidadesDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import model.Cidade;
import model.Distanciacidades;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "distanciaCidades")
@RequestScoped
public class DistanciaCidadesBean {

    private List<Distanciacidades> lstDistanciaCidades;
    private Distanciacidades distanciaCidades;
    private int cidadeIni, cidadeFim;
    
    
    private List<Cidade> cidadesItems;

    public List<Distanciacidades> getLstDistanciaCidades() {
        return lstDistanciaCidades;
    }

    public void setLstDistanciaCidades(List<Distanciacidades> lstDistanciaCidades) {
        this.lstDistanciaCidades = lstDistanciaCidades;
    }

    public Distanciacidades getDistanciaCidades() {
        return distanciaCidades;
    }

    public void setDistanciaCidades(Distanciacidades distanciaCidades) {
        this.distanciaCidades = distanciaCidades;
    }

    public List<Cidade> getCidadesItems() {
        return cidadesItems;
    }

    public void setCidadesItems(List<Cidade> cidadesItems) {
        this.cidadesItems = cidadesItems;
    }

    public int getCidadeIni() {
        return cidadeIni;
    }

    public void setCidadeIni(int cidadeIni) {
        this.cidadeIni = cidadeIni;
    }

    public int getCidadeFim() {
        return cidadeFim;
    }

    public void setCidadeFim(int cidadeFim) {
        this.cidadeFim = cidadeFim;
    }
    
    
    
    
    /**
     * Creates a new instance of DistanciaCidadesBean
     */
    public DistanciaCidadesBean() {
        this.distanciaCidades = new Distanciacidades();
        this.distanciaCidades.setCidadeInicio(new Cidade());
        this.distanciaCidades.setCidadeFim(new Cidade());
        this.cidadesItems = new CidadeDao().findAll();
    }
    
    
    
    public String ListaDistanciaCidades(){
        this.lstDistanciaCidades = new DistanciaCidadesDao().findAll();
        return "/security_admin/DistanciaCidades/index";
    }
    
    public String Novo(){
        this.cidadesItems = new CidadeDao().findAll();
        return "/security_admin/DistanciaCidades/novo";
    }
    
    public String Gravar(){
        this.distanciaCidades.setCidadeInicio(new CidadeDao().findById(cidadeIni));
        this.distanciaCidades.setCidadeFim(new CidadeDao().findById(cidadeFim));
        
        if(this.distanciaCidades.getCidadeInicio() != null && this.distanciaCidades.getCidadeFim() != null){
            new DistanciaCidadesDao().save(this.distanciaCidades);
        }
        
        return this.ListaDistanciaCidades();
    }
    
}
