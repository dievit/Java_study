/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_pedido;

/**
 *
 * @author mto_l
 */
public class Cliente {
    private String nome;
    private int cpf;
    private Data data;

    public Cliente(String nome, int cpf, Data data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        
    }
    public void imprimir(){
        System.out.println("Cliente");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data: " + this.data.formatarData());
        System.out.println("\n");
        
    }
}
