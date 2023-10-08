/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote1;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class Exercicio5 {

    public void executar() {
        Scanner ler = new Scanner(System.in);
        int n = 8;
        int vetor[] = new int[n];
        int i;
        
        for(i=0;i<8; i++){
            System.out.printf("Entre com %do. valor %d: ", (i+1), n);
            vetor[i] = ler.nextInt();
            
        }
        for(i=0; i<4; i++){
            int temp = vetor[i];
            vetor[i] = vetor[n-4+i];
            vetor[n-4+i] = temp;
                  
        }
        ler.close();
        StringBuilder resultado = new StringBuilder();
        for(i=0; i<n; i++){
            resultado.append(vetor[i]);
            if(i>=0){
                resultado.append(", ");
            }
            
        }
     System.out.println("Trocando os 4 ultimos com os 4 primeiros, o resultado e: " +resultado.toString());
    }
    
}
