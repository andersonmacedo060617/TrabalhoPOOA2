/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
    
    
    /**
     * Creates a new instance of DistanciaCidadesBean
     */
    public DistanciaCidadesBean() {
    }
    
    public String ListaDistanciaCidades(){
        return "/security_admin/DistanciaCidades/index";
    }
    
}
