/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author mto_l
 */
public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String RG, String nome, double salario) {
        super(RG, nome);
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double aumentoSalario(double percentual){
        double aumento = salario * percentual;
        salario += aumento;
        return salario;
    }
}
