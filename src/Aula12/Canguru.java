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
public class Canguru extends Mamifero {

   @Override
    public void locomover() {
     System.out.println("Saltando");
    }

    public void usarBolsa(){
        
        System.out.println(" Usando a bolsa ");
        
    }


     @Override
        public void emitirSom(){
        System.out.println ("AuAuAuAu!");

        }



    
}
