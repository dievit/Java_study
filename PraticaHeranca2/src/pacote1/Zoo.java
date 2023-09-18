/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote1;

/**
 *
 * @author mto_l
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Nemo",1.2,"Marinho");
        Peixe peixe2 = new Peixe("Dory",0.8,"Marinho");
        Cachorro cachorro1 = new Cachorro("Max",25.0,"Golden Retriver");
        Cachorro cachorro2 = new Cachorro("Tobby Maguire", 3.2,"Pincher");
        
        System.out.println("Atributos do Peixe 1: ");
        System.out.println("Nome: " +peixe1.getNome());
        System.out.println("Peso: " +peixe1.getPeso() +"Kg");
        System.out.println("Habitat " +peixe1.getTipoHabitat());
            System.out.println(" ");
            
        System.out.println("Atributos do Peixe 2: ");
        System.out.println("Nome: " +peixe2.getNome());
        System.out.println("Peso: " +peixe2.getPeso()+"Kg");
        System.out.println("Habitat: " +peixe2.getTipoHabitat());
            System.out.println(" ");

        System.out.println("Atributos do Cachorro 1:");
        System.out.println("Nome: "+cachorro1.getNome());
        System.out.println("Peso: "+cachorro1.getPeso()+"Kg");
        System.out.println("Raca: "+cachorro1.getRaca());
            System.out.println(" ");

        System.out.println("Atributos do Cachorro 2:");
        System.out.println("Nome: "+cachorro2.getNome());
        System.out.println("Peso: "+cachorro2.getPeso()+"Kg");
        System.out.println("Raca :"+cachorro2.getRaca());
        
        
        
        // TODO code application logic here
    }
    
}
