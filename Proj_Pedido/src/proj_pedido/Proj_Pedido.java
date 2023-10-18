/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_pedido;

/**
 *
 * @author mto_l
 */
public class Proj_Pedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1, it2, it3, it4, it5, it6, it7;
        it1 = new Item(100,3,3);
        it2 = new Item(101, 2, 4);
        it3 = new Item(102,1,5);
        
        Data dataAniversario1 = new Data(16,10,2000);
        Data dataPedido1 = new Data(16,10,2023);
        Cliente cliente1 = new Cliente("Joao", 1234512354, dataAniversario1);
        
        Data dataAniversario2 = new Data(27,03,2007);
        Data dataPedido2 = new Data(15,10,2022);
        Cliente cliente2 = new Cliente("Maria", 1283123912, dataAniversario2);
        
       
        Pedido pedido1 = new Pedido (1001,  cliente1, dataPedido1);
        
        pedido1.adicionaItem(it1);
        pedido1.adicionaItem(it2);
        pedido1.adicionaItem(it3);
        
        Pedido pedido2 = new Pedido(1002, cliente2, dataPedido2);
        
        pedido2.adicionaItem(it1);
        pedido2.adicionaItem(it2);
        pedido2.adicionaItem(it3);
        pedido2.adicionaItem(it3);
        
        pedido1.imprimir();
        pedido2.imprimir();
        
        
        
        // TODO code application logic here
    }
    
}
