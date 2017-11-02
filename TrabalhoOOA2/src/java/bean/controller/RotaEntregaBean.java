/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Rotaentrega;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "rotaEntrega")
@RequestScoped
public class RotaEntregaBean {
    private List<Rotaentrega> lstRotasEntrega;
    private Rotaentrega rotaEntrega;

    public List<Rotaentrega> getLstRotasEntrega() {
        return lstRotasEntrega;
    }

    public void setLstRotasEntrega(List<Rotaentrega> lstRotasEntrega) {
        this.lstRotasEntrega = lstRotasEntrega;
    }

    public Rotaentrega getRotaEntrega() {
        return rotaEntrega;
    }

    public void setRotaEntrega(Rotaentrega rotaEntrega) {
        this.rotaEntrega = rotaEntrega;
    }
    
    
    /**
     * Creates a new instance of RotaEntregaBean
     */
    public RotaEntregaBean() {
    }
    
    public String ListaRotaEntrega(){
        return "/security_admin/RotaEntrega/index";
    }
}
