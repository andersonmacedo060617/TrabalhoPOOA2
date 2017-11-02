/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;

import dao.BaseDao;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
public class PorteEntregaDao extends BaseDao{
    
    public List<Porteentrega> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Porteentrega.findAll");
            return q.getResultList();
        }finally{
            close();
        }
        
    }
    
    public Porteentrega findById(int Id){
        this.open();
        
        try{
            Query q = em.createNamedQuery("Porteentrega.findById");
        
            q.setParameter("id", Id);

            return (Porteentrega) q.getSingleResult();
        
        }catch(NoResultException ex){
            return null;
        }catch(NonUniqueResultException ex){
            return null;
        }finally{
            this.close();
        }
    }
    
    
    
}
