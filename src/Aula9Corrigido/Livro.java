/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9Corrigido;

import Aula9.*;
import java.util.Random;

/**
 *
 * @author MARCELO
 */
public class Livro implements  Publicacao {
    private String titulo;
    private String autor;
    private int totpaginas;
    private boolean aberto;
    private Pessoa leitor ;
    private int pagAtual;

    public Livro(String titulo, String autor, int totpaginas,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.leitor = leitor;
      
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private  String getTitulo() {
        return titulo;
    }

    private  void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private  String getAutor() {
        return autor;
    }

    private  void setAutor(String autor) {
        this.autor = autor;
    }

    private  int getTotpaginas() {
        return totpaginas;
    }

    private  void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    private boolean getAberto() {
        return aberto;
    }

    private  void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private  Pessoa getLeitor() {
        return leitor;
    }

    private  void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    /* private String titulo;
    private String autor;
    private int totpaginas;
    private boolean aberto;
    private Pessoa leitor 
    */
    
    
    public String detalhes() {
    
        return "Livro{" + "titulo=" + titulo 
                        + "\n, autor=" + autor 
                      + "\n Total de Páginas=" + totpaginas 
                      + "\n Aberto= " + aberto + 
                        "\n Leitor= " + leitor.getNome()+ 
                        "\n Idade = " + leitor.getIdade()+
                        "\n Sexo =  " + leitor.getSexo()+
                        "\n Página Atual = " + pagAtual;
                                       
                 
       
    }

    @Override
    public void abrir() {
        
        this.aberto = true;
    
    }

    @Override
    public void fechar() {
       
        this.aberto=false;
       
    }

    @Override
    public void folhear(int p) {
     if(p>this.totpaginas){
         this.pagAtual=0;
     }
     else{
       
         this.pagAtual=p;  
     }
         
        
    }
        
    

    
      

    @Override
    public void avancarpagina() {
       this.pagAtual++;
                
                   
                 
    }

    @Override
    public void voltarpagina() {
        this.pagAtual--;
          
    }



}
