/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.CidadeDao;
import dao.model.DistanciaCidadesDao;
import dao.model.RotaProntoDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.Cidade;
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
    private int idCidadeOrigem, idCidadeDestino;
    private List<Cidade> lstCidades;

    public RotaProntoBean() {
        this.rotaPronta = new Rotapronta();
        this.lstRotasProntas = new ArrayList<>();
        this.lstCidades = new CidadeDao().findAll();
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

    public int getIdCidadeOrigem() {
        return idCidadeOrigem;
    }

    public void setIdCidadeOrigem(int idCidadeOrigem) {
        this.idCidadeOrigem = idCidadeOrigem;
    }

    public int getIdCidadeDestino() {
        return idCidadeDestino;
    }

    public void setIdCidadeDestino(int idCidadeDestino) {
        this.idCidadeDestino = idCidadeDestino;
    }

    public List<Cidade> getLstCidades() {
        return lstCidades;
    }

    public void setLstCidades(List<Cidade> lstCidades) {
        this.lstCidades = lstCidades;
    }
    
    
    
    
    
    public String LstRotasProntas(){
        this.lstRotasProntas = new RotaProntoDao().findAll();
        return "/security_admin/RotaPronta/index";
    }
    
    public String Novo(){
        return "/security_admin/RotaPronta/novo";
    }
    
    public String Gravar(){
        this.rotaPronta.setCidadeOrigem(new CidadeDao().findById(idCidadeOrigem));
        this.rotaPronta.setCidadeDestino(new CidadeDao().findById(idCidadeDestino));
        
        if(this.rotaPronta.getCidadeOrigem() != null && this.rotaPronta.getCidadeDestino() != null){
            new RotaProntoDao().save(this.rotaPronta);
        }
        
        return this.LstRotasProntas();
    }
    
    public String AddPontoParada(){
        int idRota = 0;
           return "/security_admin/RotaPronta/novo"; 
    }
    
}
