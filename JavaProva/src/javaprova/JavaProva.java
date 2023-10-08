/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprova;

/**
 *
 * @author mto_l
 */
public class JavaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Abacate", 42, "E a resposta para tudo");
        Disciplina disciplina2 = new Disciplina("Matematica", 27, "Chata pra caramba");
        Disciplina disciplina3 = new Disciplina("Portugues", 123, "Dificil demais");
        
        disciplina1.imprimir();
        disciplina2.imprimir();
        disciplina3.imprimir();
        // TODO code application logic here
    }
    
}
