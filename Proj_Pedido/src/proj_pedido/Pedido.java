/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_pedido;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


public class Pedido {
    private int numero;
    private List<Item> lista;
    private Data dataPedido;
    private Cliente clienteCadastro;
    
    public Pedido(int numero, Cliente clienteCadastro, Data dataPedido){
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.clienteCadastro = clienteCadastro;
        lista=new ArrayList<Item>();
    }
    
    public void adicionaItem(Item item){
        lista.add(item);
    }
    public void removeItem(Item item){
        lista.remove(item);
    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<lista.size();i++){
            Item umItem = lista.get(i);
            total = total + umItem.calcularCustoItem();
    }
        return total;
    }
    public void imprimir(){
        System.out.println("Pedido: " + numero);
        System.out.println("Data do pedido: " + dataPedido.formatarData());
        clienteCadastro.imprimir();
        System.out.println("Itens: ");
        for(int i=0; i<lista.size(); i++){
            Item umItem=lista.get(i);
            System.out.println("*");
            umItem.Imprime();
        }
        System.out.println("Total do Pedido: " +calcularTotal());
    }
}

