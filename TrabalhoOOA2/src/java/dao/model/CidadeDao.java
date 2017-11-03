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
import model.Cidade;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
public class CidadeDao extends BaseDao<Cidade>{
    
    public List<Cidade> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Cidade.findAll");
            return q.getResultList();
        }finally{
            close();
        }
        
    }
    
    public Cidade findById(int IdCidade){
        this.open();
        
        try{
            Query q = em.createNamedQuery("Cidade.findById");
        
            q.setParameter("id", IdCidade);

            return (Cidade) q.getSingleResult();
        
        }catch(NoResultException ex){
            return null;
        }catch(NonUniqueResultException ex){
            return null;
        }finally{
            this.close();
        }
    }
}
