/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote1;

/**
 *
 * @author mto_l
 */
public class Funcionario {
    protected String nome;
    protected int cpf;
    protected double salario;
    
    public Funcionario(String nome, int CPF, double salario){
        this.nome = nome;
        this.cpf = CPF;
        this.salario = salario;
}
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    
}
