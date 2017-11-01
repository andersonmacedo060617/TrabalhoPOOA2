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
public class Entrega {
    private int Id;
    private double Valor;
    private PorteEntrega PorteEntrega;
    private Cliente Cliente;
    private Motorista Motorista;
    private RotaEntrega RotaEntrega;
    private Date DataContratacao;
    private boolean Status;

    public Entrega() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public PorteEntrega getPorteEntrega() {
        return PorteEntrega;
    }

    public void setPorteEntrega(PorteEntrega PorteEntrega) {
        this.PorteEntrega = PorteEntrega;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Motorista getMotorista() {
        return Motorista;
    }

    public void setMotorista(Motorista Motorista) {
        this.Motorista = Motorista;
    }

    public RotaEntrega getRotaEntrega() {
        return RotaEntrega;
    }

    public void setRotaEntrega(RotaEntrega RotaEntrega) {
        this.RotaEntrega = RotaEntrega;
    }

    public Date getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(Date DataContratacao) {
        this.DataContratacao = DataContratacao;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
    
}
