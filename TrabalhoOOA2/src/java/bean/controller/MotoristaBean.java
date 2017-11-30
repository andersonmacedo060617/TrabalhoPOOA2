/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Motorista;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "motorista")
@SessionScoped
public class MotoristaBean {

    private Motorista motoritaLogin;

    public Motorista getMotoritaLogin() {
        return motoritaLogin;
    }

    public void setMotoritaLogin(Motorista motoritaLogin) {
        this.motoritaLogin = motoritaLogin;
    }
    
    
    /**
     * Creates a new instance of MotoristaBean
     */
    public MotoristaBean() {
    }
    
    public String Logar(){
        return null;
    }
}
