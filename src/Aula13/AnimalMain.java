/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13;

/**
 *
 * @author MARCELO
 */
public class AnimalMain {
    public static void main(String[]args){
       // Animal x = new Animal(); não pode ser instanciada pois é abstrata
       // x.emitirSom();
        /*Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        */
       Cachorro c = new Cachorro();
   
       c.reagir("Olá"); // Abanar e Latir
       c.reagir("Vai Apanhar");// Rosnar
       c.reagir(11,45);//Abanar
       c.reagir(21,00);//Ignorar
       c.reagir(true);//Abanar
       c.reagir(false);//Rosnar e Latir
       c.reagir(2, 12.5f);//Latir
       c.reagir(17, 4.5f); // Rosnar

      
      
         
/*
                 
  */      
    }
}
