/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote1;

/**
 *
 * @author mto_l
 */
public class Gerente extends Funcionario{
    private int senha;
    
    public Gerente(int senha, String nome, int CPF, double salario) {
        super(nome, CPF, salario);
        this.senha = senha;
    }
    public int getSenha(){
        return senha;
    }
    public void setSenha(){
        this.senha = senha;
    }
    public boolean autentica(int senha){
        return this.senha == senha;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario = salario;
    }
}
