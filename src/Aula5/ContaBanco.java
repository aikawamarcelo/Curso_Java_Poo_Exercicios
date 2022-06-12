/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author MARCELO
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

public void ContaBanco(){
    this.saldo= 0;
    //this.setSaldo(0);
    status=false;
    }
    public void setnumConta(int n){
        this.numConta=n;
    }
    
    public int getnumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
     this.tipo=t;   
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono=d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status=s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void estadoAtual(){
    
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: "  + this.getTipo());
        System.out.println("Dono: "  + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    
    }
    
    public void abrirConta(String t){
        
            this.setTipo(t);
            this.setStatus(true);
        if (t == "CC"){
            //saldo=50;
            this.setSaldo(50);
                    }
           else {
            
               if (t == "CP"){
                this.setSaldo(150);
                           }
                }
    
    } 
        
    public void fecharConta(){
        
        if (this.getSaldo()>0){
            System.out.println("Ainda há dinheiro nessa conta");
        if (this.getSaldo()<0)
            System.out.println(" A conta está em débito");
        }
        else{
            this.setStatus(false);
        }
    }
    public void depositar(double v){
        
    if (this.getStatus()==true){
        
       // saldo = saldo + v;
        this.setSaldo(this.getSaldo()+v);
        
        System.out.println("Depositando na sua conta");
    }
    else{
     if(this.getStatus()==false)
     System.out.println("Impossível depositar");
     }
    }
    public void sacar(double v){
     if(this.getStatus() == true){
        if (this.getSaldo() >= v){
       this.saldo = this.saldo - v;
       System.out.println(" Saque realizado na conta ");
       // this.setSaldo(this.getSaldo() - v)
     }
     }
        if (this.getStatus() == false){ 
       
       System.out.println("Impossível sacar");
    
         }
     if(this.getSaldo()< v ){
         System.out.println("Impossível sacar em uma conta fechada");
     }
    
  }
     public void pagarMensal( double v){
         
         if (this.getTipo() == "CC"){
             
             v = 12;
             
         }
         
         if (this.getTipo() == "CP"){
             
             v=20;
             
         }
     
        if (this.getStatus() == true){
            if (this.getSaldo() > v) 
                this.saldo = this.saldo - v; // setSaldo(getSaldo() - v)
            
            System.out.println("Mensalidade paga com Sucesso!");
        }   
            else{
        System.out.println( " Saldo Insuficiente " );
            }
        System.out.println(" Impossível pagar ");
     
        }
     
    
     }
       

        


