/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.MotoristaDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Motorista;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "motoristaLg")
@SessionScoped
public class MotoristaLoginBean {

    private Motorista motoristaLogin;
    private String mensagem;
    private boolean logado;
    
    public Motorista getMotoristaLogin() {
        return motoristaLogin;
    }

    public void setMotoritaLogin(Motorista motoritaLogin) {
        this.motoristaLogin = motoristaLogin;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    
    
    
    
    /**
     * Creates a new instance of MotoristaBean
     */
    public MotoristaLoginBean() {
        this.mensagem = "";
        motoristaLogin = new Motorista();
        logado = false;
    }
    
    public String LoginMotorista(){
        logado = false;
        return "./loginMotorista?faces-redirect=true";
        
    }
    
    public String Logar(){
        Motorista m = new MotoristaDao().findByLoginSenha(this.motoristaLogin.getLogin(), this.motoristaLogin.getSenha());
        String retorno = "loginMotorista";
        if(m != null){
            this.motoristaLogin = m;
            logado = true;
            retorno = "security_admin/index";
        }else{
            logado = false;
            this.mensagem = "Login ou Senha incorretos";
        }
        return retorno;
    }
    
    public String LogOut(){
        this.motoristaLogin = new Motorista();
        this.logado = false;
        return LoginMotorista();
    }
}
