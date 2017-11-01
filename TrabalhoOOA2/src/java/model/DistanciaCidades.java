/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class DistanciaCidades {
    private int Id;
    private Cidade CidadeInicio;
    private Cidade CidadeFim;

    public DistanciaCidades() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cidade getCidadeInicio() {
        return CidadeInicio;
    }

    public void setCidadeInicio(Cidade CidadeInicio) {
        this.CidadeInicio = CidadeInicio;
    }

    public Cidade getCidadeFim() {
        return CidadeFim;
    }

    public void setCidadeFim(Cidade CidadeFim) {
        this.CidadeFim = CidadeFim;
    }
    
    
}
