/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;

import dao.BaseDao;
import java.util.List;
import javax.persistence.Query;
import model.Distanciacidades;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
public class DistanciaCidadesDao extends BaseDao<Distanciacidades>{
    public List<Distanciacidades> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Distanciacidades.findAllCompleta");
            return q.getResultList();
        }finally{
            close();
        }
        
    }
}
