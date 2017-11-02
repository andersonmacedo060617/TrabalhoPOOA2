/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aluno
 */
public abstract class BaseDao<C> {
    protected EntityManagerFactory emf;
    protected EntityManager em;
    
    protected void open(){
        emf = Persistence.createEntityManagerFactory("TrabalhoOOA2PU");
        em = emf.createEntityManager();
    }
    
    protected void close(){
        em.close();
        emf.close();
    }
    
    public void save(Object C){
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
    
    public void delete(Object C){
        this.open();
        try{
            Object ob = em.merge(C);
            em.getTransaction().begin();
            em.remove(ob);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.close();
        }
    }
}
