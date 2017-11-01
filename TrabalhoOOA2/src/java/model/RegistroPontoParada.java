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
public class RegistroPontoParada {
    private int Id;
    private Date DataHoraSaidaPrevisto;
    private Date DataHoraSaidaRealizado;
    private Date DataHoraChegadaPrevisto;
    private Date DataHoraChegadaRealizado;
    private RotaEntrega RotaDaEntrega;
    

    public RegistroPontoParada() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getDataHoraSaidaPrevisto() {
        return DataHoraSaidaPrevisto;
    }

    public void setDataHoraSaidaPrevisto(Date DataHoraSaidaPrevisto) {
        this.DataHoraSaidaPrevisto = DataHoraSaidaPrevisto;
    }

    public Date getDataHoraSaidaRealizado() {
        return DataHoraSaidaRealizado;
    }

    public void setDataHoraSaidaRealizado(Date DataHoraSaidaRealizado) {
        this.DataHoraSaidaRealizado = DataHoraSaidaRealizado;
    }

    public Date getDataHoraChegadaPrevisto() {
        return DataHoraChegadaPrevisto;
    }

    public void setDataHoraChegadaPrevisto(Date DataHoraChegadaPrevisto) {
        this.DataHoraChegadaPrevisto = DataHoraChegadaPrevisto;
    }

    public Date getDataHoraChegadaRealizado() {
        return DataHoraChegadaRealizado;
    }

    public void setDataHoraChegadaRealizado(Date DataHoraChegadaRealizado) {
        this.DataHoraChegadaRealizado = DataHoraChegadaRealizado;
    }
}
