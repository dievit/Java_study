/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote5;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class exe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        for(i=0; i<n; i++){
            System.out.println(vetor[i] +" ");
        }
        // TODO code application logic here
    }
    
}
