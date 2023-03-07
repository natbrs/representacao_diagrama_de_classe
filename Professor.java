/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class Professor {
    private double salario;
    private String disciplina;
    private String nome;
    
    public Professor (String nome, String disciplina, double salario){ 
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }
  
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getNome(String nome){ 
        return nome;
    }
    
    public void setDiciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public String getDiciplina(String disciplina){ 
        return disciplina;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){ 
        return salario;
    }
    
    public void printDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: "+ disciplina);
       System.out.println("Cidade: "+ salario);
    }
}