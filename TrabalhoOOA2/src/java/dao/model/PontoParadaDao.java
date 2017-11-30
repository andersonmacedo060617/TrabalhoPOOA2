/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;

import dao.BaseDao;
import java.util.List;
import javax.persistence.Query;
import model.Pontoparadaprevisto;

/**
 *
 * @author Anderson2
 */
public class PontoParadaDao extends BaseDao<Pontoparadaprevisto>{
    public List<Pontoparadaprevisto> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Pontoparadaprevisto.findAllCompleto");
            return q.getResultList();
        }finally{
            close();
        }
    }
    
    public List<Pontoparadaprevisto> findAllByRota(){
        open();
        try{
            Query q = em.createNamedQuery("Pontoparadaprevisto.findAllCompleto");
            
            return q.getResultList();
        }finally{
            close();
        }
    }
    
    public void save(Pontoparadaprevisto C){
        this.open();
        try{
            em.getTransaction().begin();
            
            em.persist(C);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            close();
        }
    }
}
