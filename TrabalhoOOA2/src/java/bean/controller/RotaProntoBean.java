/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.RotaProntoDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Rotapronta;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "rotaPronto")
@RequestScoped
public class RotaProntoBean {
    private List<Rotapronta> lstRotasProntas;
    private Rotapronta rotaPronta;

    public RotaProntoBean() {
        this.rotaPronta = new Rotapronta();
        this.lstRotasProntas = new ArrayList<>();
    }
    
    

    public List<Rotapronta> getLstRotasProntas() {
        return lstRotasProntas;
    }

    public void setLstRotasProntas(List<Rotapronta> lstRotasProntas) {
        this.lstRotasProntas = lstRotasProntas;
    }

    public Rotapronta getRotaPronta() {
        return rotaPronta;
    }

    public void setRotaPronta(Rotapronta rotaPronta) {
        this.rotaPronta = rotaPronta;
    }
    
    
    
    public String LstRotasProntas(){
        this.lstRotasProntas = new RotaProntoDao().findAll();
        return "/security_admin/RotaPronta/index";
    }
    
    
}
