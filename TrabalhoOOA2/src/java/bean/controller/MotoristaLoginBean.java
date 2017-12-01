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
    
    
    
    
    /**
     * Creates a new instance of MotoristaBean
     */
    public MotoristaLoginBean() {
        this.mensagem = "security_admin/index";
    }
    
    public String LoginMotorista(){
        return "loginMotorista";
    }
    
    public String Logar(){
        Motorista m = new MotoristaDao().findByLoginSenha(this.motoristaLogin.getLogin(), this.motoristaLogin.getSenha());
        String retorno = "loginMotorista";
        if(m != null){
            this.motoristaLogin = m;
            retorno = "security_admin/index";
        }else{
            this.mensagem = "Login ou Senha incorretos";
        }
        return retorno;
    }
}
