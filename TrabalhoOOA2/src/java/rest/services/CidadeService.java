/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import dao.model.CidadeDao;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Cidade;

@Path("/cidade")
public class CidadeService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/findAll")
    public List<Cidade> all(){
        return new CidadeDao().findAll();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    @Path("/{id}")
    public Cidade findById(@PathParam("id") int id){
        Cidade c = new CidadeDao().findById(id);
        if(c == null){
            c = new Cidade(0, "Não Encontrado");
        }
        
        return c;
    }
}
