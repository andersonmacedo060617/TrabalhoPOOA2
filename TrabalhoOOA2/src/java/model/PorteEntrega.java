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
public class PorteEntrega {
    private int Id;
    private String Descricao;
    private String TipoVeiculo;
    private double ValorKm;
    private double TempoPorKm;

    public PorteEntrega() {
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

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String TipoVeiculo) {
        this.TipoVeiculo = TipoVeiculo;
    }

    public double getValorKm() {
        return ValorKm;
    }

    public void setValorKm(double ValorKm) {
        this.ValorKm = ValorKm;
    }

    public double getTempoPorKm() {
        return TempoPorKm;
    }

    public void setTempoPorKm(double TempoPorKm) {
        this.TempoPorKm = TempoPorKm;
    }
    
    
}
