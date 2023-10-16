/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

/**
 *
 * @author mto_l
 */
public class Cliente {
    private String nome;
    private int cpf;
    private String data = this.data;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public void imprimir(){
        System.out.println("Cliente");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data: " + this.data);
        System.out.println("\n");
        
    }
}
   
