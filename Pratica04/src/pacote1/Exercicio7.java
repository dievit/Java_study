/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

public class Exercicio7 {
    public void executar(){
    int[] A = {1,2,4,6,21};
    int[] B = {2,3,6,7,9,11,15,20};
    
    System.out.println("Elementos comuns entre os vetores A e B: ");
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < A.length; i++){
        for (int j = 0; j < B.length; j++){
            if (A[i] == B[j]){
                resultado.append(A[i]);
                resultado.append(", ");
                }
                
            }
        }
        if (resultado.length() > 0){
            resultado.setLength(resultado.length()-2);
            System.out.println(resultado.toString());
    } else {
            System.out.println("Nao ha elementos em comum.");
        }
    
        
        
}
}
