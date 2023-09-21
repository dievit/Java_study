package pack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mto_l
 */
public class Aluno {
    private String nome;
    private int ra;
    private char sexo;
    private int rg;
    private String cpf;
    private String data ;
    
    
    public Aluno(String nome, int ra, char sexo, int rg, String cpf, String dia, String mes, String ano){
        this.nome = nome;
        this.ra = ra;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        Data data = new Data(dia,mes,ano);
        this.data = data.formatarData();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
       
    public void imprimir(){
        System.out.println("Informacoes Aluno");
        System.out.println("Nome: " + this.nome);
        System.out.println("RA: " + this.ra);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("RG: "+this.rg);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Data de Nasc.: "+ this.data);
        System.out.println("\n");
    }
    
}
