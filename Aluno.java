/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aluno {
    private int nota;
    private String nome;
    private int idade;
    
    public Aluno (String nome, int nota){ 
        this.nome = nome;
        this.nota = nota;
    }
  
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(String nome){ 
        return nome;
    } 
    
    public void setNota(int nota){
        this.nota = nota;
    }
    
    public int getNota(){
        return nota;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void printDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Cargo: "+ nota);
       System.out.println("Cidade: "+ idade);
    }
}