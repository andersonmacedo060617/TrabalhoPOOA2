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
@ManagedBean(name = "clienteLg")
@SessionScoped
public class ClienteLgBean {

    private Cliente clienteLogin;
    private boolean logado;

    public Cliente getClienteLogin() {
        return clienteLogin;
    }

    public void setClienteLogin(Cliente clienteLogin) {
        this.clienteLogin = clienteLogin;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    
    
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteLgBean() {
        clienteLogin = new Cliente();
        logado = false;
    }
    
    public String Logar(){
        return "loginCliente?faces-redirect=true";
    }
    
    public String LoginCliente(){
        return "loginCliente?faces-redirect=true";
    }
    
}
