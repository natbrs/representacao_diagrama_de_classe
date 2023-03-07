/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Funcionario {
    private String cargo;
    private double salario;
    private String nome ;
    
    public Funcionario (String nome, int cargo, double salario){ 
        this.nome = nome;   
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(String nome){ 
        return nome;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo){ 
        this.cargo = cargo;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){ 
        this.salario = salario;
    }
    
    public void printDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Cargo: "+ cargo);
       System.out.println("Cidade: "+ salario);
    }
}