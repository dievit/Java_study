/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pacote1;

/**
 *
 * @author mto_l
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente1 = new Gerente(123456, "Mario", 98763, 5000.0);
        Gerente gerente2 = new Gerente(324442, "Genivaldo", 02020202, 3500.0);
        System.out.println("Gerente 1");
        System.out.println("Nome: " +gerente1.getNome());
        System.out.println("CPF: "+gerente1.getCpf());
        System.out.println("Salario: "+gerente1.getSalario()); 
        System.out.println("Autenticacao: " +gerente1.autentica(123456));
        System.out.println("");
        
        System.out.println("Gerente 2");
        System.out.println("Nome: " +gerente2.getNome());
        System.out.println("CPF: " +gerente2.getCpf());
        System.out.println("Salario: " +gerente2.getSalario());
        System.out.println("Autenticacao: " +gerente2.autentica(223331));
        
      
        
        
    }
    
}
