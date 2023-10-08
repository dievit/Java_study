/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

import java.util.Scanner;

/**
 *
 * @author mto_l
 */
public class Exercicio2 {
    public void executar(){
        System.out.println("Escreva um programa principal que: ");
        System.out.println("a) Leia 10 numeros (vetor inteiros) a partir de valores digitados pelo usuario.");
        System.out.println("b) Imprima na tela apenas os valores maiores e igual a20.");
        
        Scanner ler = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];
        int i;
        
        for(i=0; i<n; i++){
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            vetor[i] = ler.nextInt();  
        }
        
        
        for(i=0; i<10; i++) {
            if(vetor[i]>=20){
                System.out.println("Numeros maiores que 20: "+vetor[i]);
            }
        }
    }
}