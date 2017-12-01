/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.MotoristaDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Motorista;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "motorista")
@RequestScoped
public class MotoristaBean {

    private Motorista motorista;
    private List<Motorista> lstMotoristas;

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public List<Motorista> getLstMotoristas() {
        return lstMotoristas;
    }

    public void setLstMotoristas(List<Motorista> lstMotoristas) {
        this.lstMotoristas = lstMotoristas;
    }
    
    
    
    /**
     * Creates a new instance of MotoristaBean
     */
    public MotoristaBean() {
    }
    
    public String ListaMotoristas(){
        lstMotoristas = new MotoristaDao().findAll();
        return "security_admin/Motorista/index";
    }
    
    public String Novo(){
        this.motorista = new Motorista();
        return "security_admin/Motorista/novo";
    }
    
    public String Gravar(){
        new MotoristaDao().save(this.motorista);
        return ListaMotoristas();
    }
    
}
