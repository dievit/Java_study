/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

public class Item{
    private int codigo;
    private int quantidade;
    private double preco;
    
    public Item(int codigo, int quantidade, double preco){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calcularCusto(){
        return quantidade * preco;
    }
    
    public void imprimir(){
        System.out.println("Item: ");
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("Preco: "+this.preco);
        
        
    }
    
}
