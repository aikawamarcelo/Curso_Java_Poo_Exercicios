/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// para reescrever métodos interface deve colocar nomeclasse implements nomeInterface{




package Aula7;

/**
 *
 * @author MARCELO
 */
public class Lutador implements Controlador{
     private String nome;
 private String nacionalidade;
 private int idade;
 private double altura;
 private double peso;
 private String categoria;
 private int vitorias;
 private int derrotas;
 private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if(this.peso < 52.2 ){
           this.categoria = " Inválido ";
        }
       
       else if(this.getPeso()<= 70.3 ){
           this.categoria = " Leve ";
           
       }
        else
                if (this.getPeso() <= 83.9){
                       this.categoria = " Médio "; 
                }
       
       else if (this.getPeso() <= 120.2){
                    this.categoria = " Pesado ";
                    
                } 
        else 
                    this.categoria = " Inválido ";
            
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
   
    @Override
    public void apresentar(){
        System.out.println("Lutador: ,"+ this.getNome());
 System.out.println("Origem: ," + this.getNacionalidade());
 System.out.println(this.getIdade()+ "anos");
 System.out.println (this.getAltura() + " m de altura");
 System.out.println (" Pesando: ," + this.getPeso() + "Kg");
 System.out.println (" Ganhou: ," + this.getVitorias());
 System.out.println ( " Perdeu: ," + this.getDerrotas());
 System.out.println (" Empatou: ," + this.getEmpates());
    }
 
    @Override
    public void status(){
 System.out.println (this.getNome());
 System.out.println(" é um peso "+ this.getCategoria());
 System.out.println(this.getVitorias() + "vitórias");
 System.out.println (this.getDerrotas()+ "derrotas");
 System.out.println (this.getEmpates()+ "empates");
    } 
   
    @Override
      public void ganharLuta(){
     
     this.setVitorias(this.getVitorias() +1);
             
 }
     @Override
     public void perderLuta(){
         
     this.setDerrotas(this.getDerrotas() + 1);
 

}
     @Override
     public void empatarLuta(){
         
        this.setEmpates(this.getEmpates() + 1);
         
     }
 
}
