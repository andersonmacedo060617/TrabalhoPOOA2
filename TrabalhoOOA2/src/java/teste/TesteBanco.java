/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;

/**
 *
 * @author Anderson2
 */
public class TesteBanco {
    public static void main(String[] args){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoOOA2PU");
        
        EntityManager em = emf.createEntityManager();
        
        Cliente c;
        try{
            Query q = em.createNamedQuery("Cliente.findById");
            q.setParameter("id", 1);
            c = (Cliente)q.getSingleResult();
            System.out.println("==>" + c.getNome());
        
        }catch(NoResultException e){
            System.out.println("Nenhum Usuario Encontrado");
        }catch(NonUniqueResultException e){
            System.out.println("Mais de um usuario encontrado");
                    
        }
    }
}
