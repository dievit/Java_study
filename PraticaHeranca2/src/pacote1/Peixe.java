/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

/**
 *
 * @author mto_l
 */
public class Peixe extends Animal{
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }
    public String getTipoHabitat(){
        return tipoHabitat;
    }
    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }
    
}
