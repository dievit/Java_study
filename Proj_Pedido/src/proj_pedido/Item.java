/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_pedido;

/**
 *
 * @author mto_l
 */
public class Item {
    private int codigo;
    private int quantidade;
    private double preco;

    public Item (int codigo, int quantidade, double preco){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double calcularCustoItem(){
        return quantidade*preco;
    }
    public void Imprime(){
        System.out.println("Codigo Item: " + codigo);
        System.out.println("Quantidade Item: " +quantidade);
        System.out.println("Preco Item: " +preco);
    }
}
