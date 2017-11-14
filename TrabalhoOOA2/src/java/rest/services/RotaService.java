/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Rotapronta;

/**
 *
 * @author Anderson2
 */
public class RotaService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/findAll")
    public List<Rotapronta> all(){
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Rotapronta findById(@PathParam("id") int id){
        
        return null;
    }
}
