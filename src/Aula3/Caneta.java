/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

/**
 *
 * @author marce
 */
public class Caneta {
   public  String modelo;
    public String cor;
    private double ponta;
    protected int carga;
   private boolean tampada;
    
    public void status(){
        System.out.println(" Modelo "+ this.modelo);
        System.out.println(" Uma caneta "+ this.cor);
        System.out.println(" Ponta "+ this.ponta);
        System.out.println(" Carga "+ this.carga);
        System.out.println(" Está Tampada? "+ this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println(" Erro! Não posso rabiscar ");
        }
        else{
            System.out.println(" Estou Rabiscando ");
        
    }
    }
    
    public void tampar(){
        this.tampada=true;
    }
    
   public void destampar(){
       this.tampada=false;
    }
    
    
}
