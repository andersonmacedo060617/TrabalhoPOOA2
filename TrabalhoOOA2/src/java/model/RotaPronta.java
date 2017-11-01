/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class RotaPronta {
    private int Id;
    private String Descricao;
    private Cidade CidadeOrigem;
    private Cidade CidadeDestino;
    private ArrayList<PontoParadaPrevisto> PontosDeParada;

    public RotaPronta() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Cidade getCidadeOrigem() {
        return CidadeOrigem;
    }

    public void setCidadeOrigem(Cidade CidadeOrigem) {
        this.CidadeOrigem = CidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return CidadeDestino;
    }

    public void setCidadeDestino(Cidade CidadeDestino) {
        this.CidadeDestino = CidadeDestino;
    }

    public ArrayList<PontoParadaPrevisto> getPontosDeParada() {
        return PontosDeParada;
    }

    public void setPontosDeParada(ArrayList<PontoParadaPrevisto> PontosDeParada) {
        this.PontosDeParada = PontosDeParada;
    }
    
    
}
