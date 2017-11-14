/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import dao.model.PorteEntregaDao;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Porteentrega;

/**
 *
 * @author Anderson2
 */
public class PorteEntregaService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/findAll")
    public List<Porteentrega> all(){
        return new PorteEntregaDao().findAll();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Porteentrega findById(@PathParam("id") int id){
        Porteentrega p = new PorteEntregaDao().findById(id);
        if(p == null){
            p = new Porteentrega();
        }
        
        return p;
    }
}
