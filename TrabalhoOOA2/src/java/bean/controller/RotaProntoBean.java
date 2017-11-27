/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.CidadeDao;
import dao.model.DistanciaCidadesDao;
import dao.model.PontoParadaDao;
import dao.model.RotaProntoDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.Cidade;
import model.Distanciacidades;
import model.Pontoparadaprevisto;
import model.Rotapronta;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "rotaPronto")
@SessionScoped
public class RotaProntoBean {
    private List<Rotapronta> lstRotasProntas;
    private Rotapronta rotaPronta;
    private int idCidadeOrigem, idCidadeDestino;
    private List<Cidade> lstCidades;
    private List<Distanciacidades> lstDistancias;
    private int idDistanciaSelecionada;
    private Pontoparadaprevisto pontoParada;

    public RotaProntoBean() {
        this.rotaPronta = new Rotapronta();
        this.lstRotasProntas = new ArrayList<>();
        this.lstCidades = new CidadeDao().findAll();
        this.lstDistancias = new DistanciaCidadesDao().findAll();
        this.pontoParada = new Pontoparadaprevisto();
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

    public List<Distanciacidades> getLstDistancias() {
        return lstDistancias;
    }

    public void setLstDistancias(List<Distanciacidades> lstDistancias) {
        this.lstDistancias = lstDistancias;
    }

    public int getIdDistanciaSelecionada() {
        return idDistanciaSelecionada;
    }

    public void setIdDistanciaSelecionada(int idDistanciaSelecionada) {
        this.idDistanciaSelecionada = idDistanciaSelecionada;
    }

    public Pontoparadaprevisto getPontoParada() {
        return pontoParada;
    }

    public void setPontoParada(Pontoparadaprevisto pontoParada) {
        this.pontoParada = pontoParada;
    }

    
    
    
    
    
    
    public String LstRotasProntas(){
        this.lstRotasProntas = new RotaProntoDao().findAll();
        return "/security_admin/RotaPronta/index";
    }
    
    public String Novo(){
        this.rotaPronta = new Rotapronta();
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
    
    public String AddPontoParada(Rotapronta r){
        this.rotaPronta = r;
        return "/security_admin/RotaPronta/addPontoParada"; 
    }
    
    public String GravaPontoParada(){
        Distanciacidades distanciaSelecionada = new DistanciaCidadesDao().findById(this.idDistanciaSelecionada);
        if(distanciaSelecionada != null){
            Pontoparadaprevisto ponto = new Pontoparadaprevisto();
            ponto.setRota(rotaPronta);
            ponto.setDistanciaCidades(distanciaSelecionada);
            ponto.setOrdem((rotaPronta.UltimoNumeroOrdemParada() + 1));
            new PontoParadaDao().save(this.pontoParada);
        }
        return LstRotasProntas(); 
    }
    
}
