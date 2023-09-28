package pacote4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mto_l
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 4;
        int vetor[] = new int [n];
        int i;
        
        for(i=0; i<4; i++){
            System.out.printf("Informe %do. valor de %d: ",(1+i), n);
            vetor[i] = ler.nextInt();
            
        }
        ler.close();
        
        for(i=n -1; i>=0; i--){
            System.out.println(vetor[i]);
        }
        
        // TODO code application logic here
    }
    
}
