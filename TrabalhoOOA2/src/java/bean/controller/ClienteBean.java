/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Cliente;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "cliente")
@SessionScoped
public class ClienteBean {

    private Cliente clienteLogin;

    public Cliente getClienteLogin() {
        return clienteLogin;
    }

    public void setClienteLogin(Cliente clienteLogin) {
        this.clienteLogin = clienteLogin;
    }
    
    
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }
    
    
    public String Logar(){
        return null;
    }
}
