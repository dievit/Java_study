/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

public class Exercicio8 {
    public void executar(){
        int [] M = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] N = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        
       int produtoEscalar = 0;
       
       for(int i = 0; i < M.length; i++){
           produtoEscalar += M[i]*N[i];
       } 
       System.out.println("O produto escalar de M e N e: " +produtoEscalar);
    }
    
}
