/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula;

/**
 *
 * @author mto_l
 */
public class Exercicio1 {
    public void executar(){
    int vetor[];//declaração do vetor
        vetor = new int[5];//alocando espaço de memória
        vetor[0] = 5;
        vetor[1] = 2;
        vetor[2] = 4;
        vetor[3] = 8;
        vetor[4] = 10;
        int soma = vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4];
        System.out.println(soma);
}
}