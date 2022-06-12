/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

/**
 *
 * @author marce
 */
    public class Caneta {
    
    private double ponta;
    public String modelo;
    private boolean tampada;
    private String cor;

    public Caneta(double ponta, String modelo, String cor) {
        this.ponta = ponta;
        this.modelo = modelo;
        this.cor = cor;
    }

   
    
    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
  
    public void status(){
        
        System.out.println(" SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("A caneta está tampada: " + this.tampada);
        
        
    } 
 
}
