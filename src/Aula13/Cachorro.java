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
public class Cachorro extends Lobo {
      @Override
    public void emitirSom() {
       System.out.println("Au!Au!Au!Au!");
    }
 
 public void reagir(String frase){
     
     if(frase.equals("Toma Comida")|| (frase.equals("Olá"))){
         System.out.println("Abanar e Latir");
     }
     else{
        System.out.println(" Rosnar ");
                 }
     
     
 }

public void reagir(int hora, int min){
     if(hora<12){
         System.out.println(" Abanar ");
     } else
         if(hora>=18){
           System.out.println("Ignorar");
         }
           else
           System.out.println("Abanar e Latir");
                            
     
 }

public void reagir(boolean dono){
     if(dono){
         System.out.println(" Abanar ");
     }
     else
           System.out.println(" Rosnar e Latir ");
           this.emitirSom(); //ou só emitirSom() , dá certo
 }

public void reagir(int idade, float peso){
     if(idade<5){
      if(peso < 10){
          System.out.println(" Abanar ");
       }   
      
      else
          
          System.out.println(" Latir ");
 
     }
     else if(peso<10){
         System.out.println(" Rosnar ");
       
     }
      else
          
          System.out.println(" Ignorar ");
     
     }
     }

//public void reagir(float x, int y){
    /* assinaturas na mesma posição não são válidas se os 
    métodos são os mesmos 
   public void reagir(int hora, int min) 
    e public int reagir(int hora, int min) 
    é válido.
     public void reagir(int hora, int min) 
     e public void reagir(int hora, int min) 
    é inválido.
    public void reagir(int idade, float peso)
    e public void reagir(float x, int y)
    é válido pelas posições de assinaturas diferentes do 
    int e do float.
    */



