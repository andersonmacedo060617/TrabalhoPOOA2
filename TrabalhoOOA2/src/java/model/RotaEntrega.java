/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class RotaEntrega {
    private int Id;
    private Date DataInicio;
    private ArrayList<RegistroPontoParada> RegistroPontoParada;
    private RotaPronta RotaEscolhida;
    private Entrega Entrega;

    public RotaEntrega() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public ArrayList<RegistroPontoParada> getRegistroPontoParada() {
        return RegistroPontoParada;
    }

    public void setRegistroPontoParada(ArrayList<RegistroPontoParada> RegistroPontoParada) {
        this.RegistroPontoParada = RegistroPontoParada;
    }

    public RotaPronta getRotaEscolhida() {
        return RotaEscolhida;
    }

    public void setRotaEscolhida(RotaPronta RotaEscolhida) {
        this.RotaEscolhida = RotaEscolhida;
    }

    public Entrega getEntrega() {
        return Entrega;
    }

    public void setEntrega(Entrega Entrega) {
        this.Entrega = Entrega;
    }
    
    
}
