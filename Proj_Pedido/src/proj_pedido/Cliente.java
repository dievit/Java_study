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
    private Data dataAniversario;

    public Cliente(String nome, int cpf, Data dataAniversario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAniversario = dataAniversario;
        
    }

    
    public void imprimir(){
        System.out.println("Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataAniversario.formatarData());
        System.out.println("\n");
        
    }
}
