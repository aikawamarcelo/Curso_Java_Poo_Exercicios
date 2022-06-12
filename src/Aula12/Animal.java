/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12;

/**
 *
 * @author MARCELO
 */
public abstract class Animal {

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
    
    protected float peso;
    protected int idade;
    protected String membros;
    
    //Métodos de Animal
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
