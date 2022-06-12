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
public class Peixe extends Animal {
    private String corEscama;
@Override
    public void locomover() {
     System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
       System.out.println(" Peixe não faz som ");
    }       
     
    public void soltarBolhas(){
    
        System.out.println(" Soltando Bolhas ");       
       
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
