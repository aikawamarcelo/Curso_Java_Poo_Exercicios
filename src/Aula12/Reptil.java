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
public class Reptil extends Animal {

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
  
     private String corEscama;
    
    @Override
    public void locomover() {
     System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
       System.out.println("Som do Reptil");
    }
    
}
