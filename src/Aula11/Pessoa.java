/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;



/**
 *
 * @author MARCELO
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
    public String toString() {
        return "Pessoa{" 
             + "\nnome = " + nome + ", "
             + "\nidade = " + idade + ", "
             + "\nsexo = " + sexo + '}';
    }
    
    
    
    public void fazerAniv(){
        
        this.idade++;
     
        // OU   this.idade = this.idade+1;
        
    }
    
    
    
}
