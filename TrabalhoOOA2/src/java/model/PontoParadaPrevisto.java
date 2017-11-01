/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class PontoParadaPrevisto {
    private int Id;
    private int Ordem;
    private double TempoParada;
    private RotaPronta Rota;
    private DistanciaCidades DistanciaCidades;

    public PontoParadaPrevisto() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getOrdem() {
        return Ordem;
    }

    public void setOrdem(int Ordem) {
        this.Ordem = Ordem;
    }

    public double getTempoParada() {
        return TempoParada;
    }

    public void setTempoParada(double TempoParada) {
        this.TempoParada = TempoParada;
    }

    public RotaPronta getRota() {
        return Rota;
    }

    public void setRota(RotaPronta Rota) {
        this.Rota = Rota;
    }

    public DistanciaCidades getDistanciaCidades() {
        return DistanciaCidades;
    }

    public void setDistanciaCidades(DistanciaCidades DistanciaCidades) {
        this.DistanciaCidades = DistanciaCidades;
    }

    
    
}
