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
public class Cliente {
    private int Id;
    private String Nome;
    private String CPF;
    private String Login;
    private String Senha;
    private ArrayList<Entrega> EntregasContratadas;
    

    public Cliente() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public ArrayList<Entrega> getEntregasContratadas() {
        return EntregasContratadas;
    }

    public void setEntregasContratadas(ArrayList<Entrega> EntregasContratadas) {
        this.EntregasContratadas = EntregasContratadas;
    }
    
    
}
