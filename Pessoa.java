/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class Pessoa {
    private int idade;
    private String cidade;
    private String nome;
    
    public Pessoa (String nome, String cidade, int idade){ 
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }
  
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getNome(String nome){ 
        return nome;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(String cidade){ 
        return cidade;
    }
    
    public void printDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: "+ idade);
       System.out.println("Cidade: "+ cidade);
    }
}