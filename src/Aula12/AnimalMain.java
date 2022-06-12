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
public class AnimalMain {
    
    public static void main(String[]args){
    
   //     Animal n = new Animal(); // não é válido pois a classe é abstrata
    
   
   
   Mamifero m = new  Mamifero(); 
    Reptil r =   new Reptil();
    Peixe p = new  Peixe();
    Ave a = new Ave();

    
    
    m.setPeso(85.3f);
    m.setIdade(2);
    m.setMembros("4");
    m.locomover(); // Correndo
    m.alimentar(); // Mamando
    m.emitirSom(); // Som do Mamífero

    p.setPeso(0.35f);
    p.setIdade(1);
    p.setMembros("0");
    p.locomover();//Nadando
    p.alimentar(); // Comendo Substâncias 
    p.emitirSom(); //  Peixe não faz som
    p.soltarBolhas();

    a.setPeso(0.89f);
    a.setIdade(2);
    a.setMembros("2");
    a.locomover() ;   // Voando
    a.alimentar() ;    //  Comendo Frutas
    a.emitirSom()  ;  //  Som de Ave
    a.fazerNinho();
    
    
    Canguru c = new Canguru();
    Cachorro ca = new Cachorro();
    GoldFish g = new GoldFish();    
    Arara ar = new Arara();
    Cobra co = new Cobra();
    Tartaruga t = new Tartaruga();
 
  
  
    
    
    
    
    
    }
}