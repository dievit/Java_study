/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

/**
 *
 * @author mto_l
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario =  new Funcionario("123456","Joao", 3000.00);
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("RG: " + funcionario.getRG());
        System.out.println("Salario antes do aumento: " +funcionario.getSalario());
        
        double novoSalario = funcionario.aumentoSalario(0.10);
        System.out.println("Salario apos aumento: " +novoSalario);
                
        // TODO code application logic here
    }
    
}
