/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class Exercicio2 {
    public void executar(){
     Scanner ler = new Scanner(System.in);
        
        int n = 10;//tamanho do vetor
        int vetor[] = new int[n];//declaração do vetor 'v'
        int i;//indice ou posição
        int soma = 0;
        
        //Entrada de dados
        for(i=0; i<n; i++){
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            vetor[i] = ler.nextInt();
            soma += vetor[i];
}
}
}
