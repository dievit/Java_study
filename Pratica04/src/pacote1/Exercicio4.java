package pacote1;

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
    public void executar(){
        Scanner ler = new Scanner(System.in);
        int n = 4;
        int vetor[] = new int [n];
        int i;
        
        for(i=0; i<4; i++){
            System.out.printf("Informe %do. valor de %d: ",(1+i), n);
            vetor[i] = ler.nextInt();
            
        }
        ler.close();
        StringBuilder resultado = new StringBuilder();
        for(i=n -1; i>=0; i--){
            resultado.append(vetor[i]);
            if(i>0){
            resultado.append(", ");
        }    // TODO code application logic here
    }
    System.out.println("A sequencia inversa e: " +resultado.toString());
    }
}