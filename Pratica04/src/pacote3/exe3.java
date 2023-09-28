/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote3;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];
        int i;
        
        for(i=0; i<10; i++){
            System.out.printf("Informe %do. valor de %d: ",(i+1), n);
            vetor[i] = ler.nextInt();
            
            }
        for (i=0; i<10; i++){
            if(vetor[i] % 2 ==0) {
                System.out.println(vetor[i]);
        
        // TODO code application logic here
    }
    }
}
}
    
