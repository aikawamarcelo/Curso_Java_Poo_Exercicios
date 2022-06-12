/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula6;

/**
 *
 * @author MARCELO
 */
public class ControleRemoto implements Controlador{
   
private int volume; 
private boolean ligado; 
private boolean tocando; 

    public ControleRemoto() {
        this.volume = 100; 
        this.ligado = false; 
        this.tocando = false; 
    }

  


    private int getVolume() {
        return this.volume;
    }

    private  void setVolume(int volume) {
        this.volume = volume;
    }

    private  boolean getLigado() {
        return this.ligado;
    }

   private  void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private  boolean getTocando() {
        return this.tocando;
    }

    private  void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
    
        this.setLigado(false);
    
    }

    @Override
    public void abrirMenu() {
    
    
        System.out.println(" Está Ligado? "+ this.getLigado());
        System.out.println(" Está Tocando? " + this.getTocando());
         System.out.println(" Volume: " + this.getVolume());
        for(int i=0;i<=this.getVolume();i+=10){
            // obs: print: não há quebra de linha print + n= println que é a quevra de linha  
        System.out.print(" [] ");            
        }
           System.out.println(" ");
    
    }

    @Override
    public void fecharMenu() {
    
    System.out.println(" Fechando o Menu... ");
        
    }

    @Override
    public void maisVolume() {
  
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() +1 );
            
        }
                  
        else{
        
            System.out.println(" Impossível aumentar o volume ");

        }
    }

    @Override
    public void menosVolume() {
   
    if(this.getLigado() == true){
            this.setVolume(this.getVolume() -1 );
        
    }
    
     else{
                    System.out.println(" Impossível diminuir o volume ");
                    
                    
                   }

    
    
    }
    @Override
    public void ligarMudo() {
        
        if(this.getLigado() == true && this.getVolume()>0){
            this.setVolume(0);
            
           
            
        }
        
    }

   

    @Override
    public void play() {
        
        if(this.getLigado()== true && this.getTocando() == false){
            this.setTocando(true);
        }
        else{
             System.out.println(" Não consegui reproduzir ");
        }
    }

    @Override
    public void pause() {
        
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else{
              System.out.println(" Não consegui pausar ");
        }
    }

    @Override
    public void desligarMudo() {
       
         if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(100);
       
    }
    

    }
}
