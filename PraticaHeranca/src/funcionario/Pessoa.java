/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author mto_l
 */
public class Pessoa {
    protected String RG;
    protected String nome;
    
    public Pessoa(String RG, String nome){
        this.RG = RG;
        this.nome = nome;
    }
    
    public String getRG(){
        return RG;
    }
    
    public String getNome(){
        return nome;
    }
    
}


