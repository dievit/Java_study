/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pack;

/**
 *
 * @author mto_l
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno("Joaozinho", 123456, 'M', 87654321, "5435435", "10", "10", "2002");
        Aluno aluno2 = new Aluno("Mariazinha", 123457, 'F', 432321234, "987655432", "28", "08", "1998");
        aluno1.imprimir();
        aluno2.imprimir();
        
        
       
        
    }
    
}
