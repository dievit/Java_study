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
public class Exercicio3 {
    public void executar(){
        System.out.println("Escreva um programa principal que: ");
        System.out.println("Leia 10 numeros (vetor de inteiros ) a partir de valores digitados pelo usuario, apenas armazene no vetor os numeros pares:Obs:os valores devem ser armazenados em  posicoes consecutivas.");
        System.out.println("Imprima na tela a quantidade de valores armazenados no vetor (item a), o maior valor encontrado e tambem a media desses valores.");
        Scanner ler = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];
        int i;
        int contador = 0;
        int maiorValor = Integer.MIN_VALUE;
        int soma = 0;
        
        for(i=0; i<10; i++){
            System.out.printf("Informe %do. valor de %d: ",(i+1), n);
            int numero = ler.nextInt();
        
            if(numero % 2 == 0){
                vetor[contador] = numero;
                contador++;
                
                if(numero > maiorValor){
                    maiorValor = numero;
                }
                soma += numero;
            }
        }
    
            ler.close();
            
            if (contador>0){
                double media = (double) soma/contador;
                String mediaFormatada = String.format("%.1f", media);
                System.out.println("Quantidade de valores armazenados: " + contador);
                System.out.println("Maior valor encontrado: " +maiorValor);
                System.out.println("Media dos valores: " + mediaFormatada);
            }else{
                System.out.println("Nenhum par foi digitado!");
                
            }
        }
    }





        