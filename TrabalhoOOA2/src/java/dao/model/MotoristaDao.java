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
import model.Motorista;
import model.Pontoparadaprevisto;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
public class MotoristaDao extends BaseDao<Motorista>{
    public Motorista findById(int Id){
        this.open();
        
        try{
            Query q = em.createNamedQuery("Motorista.findById");
        
            q.setParameter("id", Id);

            return (Motorista) q.getSingleResult();
        
        }catch(NoResultException ex){
            return null;
        }catch(NonUniqueResultException ex){
            return null;
        }finally{
            this.close();
        }
    }
    
    public Motorista findByLoginSenha(String login, String senha){
        this.open();
        
        try{
            Query q = em.createNamedQuery("Motorista.findByLoginSenha");
        
            q.setParameter("login", login);
            q.setParameter("login", senha);

            return (Motorista) q.getSingleResult();
        
        }catch(NoResultException ex){
            return null;
        }catch(NonUniqueResultException ex){
            return null;
        }finally{
            this.close();
        }
    }
    
    public List<Motorista> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Motorista.findAll");
            return q.getResultList();
        }finally{
            close();
        }
    }
    
}
