/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote1;

import java.util.Scanner;

public class Exercicio6 {

    public void executar() {
        Scanner ler = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];
        int i;
        
        for(i=0;i<n;i++){
           vetor[i] = i +1;
            
        }
        
        Scanner buscar =  new Scanner(System.in);
        System.out.print("Digite o valor entre 1 e 10 a ser buscado: ");
        int valorX = buscar.nextInt();
        
        int position = -1;
        for(i=0;i<10;i++){
            if(vetor[i]==valorX){
                position = i;
                break;
                
            }
            
        }
        
        if(position != -1){
            System.out.println("O valor " + valorX + " esta na posicao [" + position + "]");
        }else{
            System.out.println("O valor " + valorX + " nao foi encontrado!");
        }
        
        
        
    }
    
}
