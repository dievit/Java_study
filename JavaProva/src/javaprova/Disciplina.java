/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprova;

/**
 *
 * @author mto_l
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private String descricao;

    public Disciplina(String nome, int codigo, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void imprimir(){
        System.out.println("Informacoes Disciplina");
        System.out.println("Nome: " +this.nome);
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Descricao: " +this.descricao);
        System.out.println("\n");
    }
}



