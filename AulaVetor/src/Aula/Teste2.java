/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 10;//tamanho do vetor
        int vetor[] = new int[n];//declaração do vetor 'v'
        int i;//indice ou posição
        int soma = 0;
        
        //Entrada de dados
        for (i=0; i<n; i++){
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            vetor[i] = ler.nextInt();
            soma += vetor[i];         
            
}
        double media = soma/n;
        System.out.println("A media dos numeros inseridos e: "+ media);
        // TODO code application logic here
    }
    
}
