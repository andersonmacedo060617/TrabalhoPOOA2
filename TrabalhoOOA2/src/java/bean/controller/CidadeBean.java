/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.controller;

import dao.model.CidadeDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Cidade;

/**
 *
 * @author Anderson2
 */
@ManagedBean(name = "cidade")
@RequestScoped
public class CidadeBean {

    private List<Cidade> lstCidades;
    private Cidade cidade;

    public List<Cidade> getLstCidades() {
        return lstCidades;
    }

    public void setLstCidades(List<Cidade> lstCidades) {
        this.lstCidades = lstCidades;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
    /**
     * Creates a new instance of CidadeBean
     */
    public CidadeBean() {
        this.cidade = new Cidade();
    }
    
    public String ListaCidades(){
        this.lstCidades = new CidadeDao().findAll();
        return "/security_admin/Cidade/index";
    }
    
    public String Novo(){
        return "/security_admin/Cidade/novo";
    }
    
    public String Gravar(){
        new CidadeDao().save(this.cidade);
        return this.ListaCidades();
    }
    
    
}
