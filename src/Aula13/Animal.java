/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13;

/**
 Uma classe abstrata implementa apenas métodos abstratos e não implementa objetos
 *
 * @author MARCELO
 */
public abstract class Animal {
      protected float peso;
    protected int idade;
    protected String membros;
    
     public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    //Atributos de Animal
    public void setMembros(String membros) {
        this.membros = membros;
    }
    
  
    //Métodos de Animal
   
    public abstract void emitirSom();
}
