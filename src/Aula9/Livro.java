/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9;

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
    public void detalhes(){
        System.out.println("Nome do Título: " + this.getTitulo());
        System.out.println("Nome do Autor: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotpaginas());
        System.out.println("Status:" + this.getAberto());
        System.out.println("Nome do Leitor: " + this.getLeitor());
    }

    @Override
    public void abrir() {
    
        if (this.getAberto() == true)
            this.setPagAtual(this.getPagAtual()+1 );
         
            System.out.println(" O livro está aberto ");
       
    }

    @Override
    public void fechar() {
       
       if (this.getAberto() == false){
           
           System.out.println(" O livro está fechado ");
       }
    }

    @Override
    public void folhear() {
    if (this.getAberto() == true)
        
            this.leitor.fazerNiver();
            Random aleatorio = new Random();
            int pessoa = aleatorio.nextInt(2);
         switch(pessoa){
            
           case 1:
                System.out.println(" Para frente: " );
                avancarpagina();
                break;
            case 2:
                 System.out.println(" Para trás: " );
                voltarpagina();
            break;
        
        }
        
    

    
        
}

    @Override
    public void avancarpagina() {
       if(this.getAberto() == true)
        
            System.out.println(" Mudar a página: ");
            
          while(this.getPagAtual()< this.getTotpaginas() )
          
              this.setPagAtual(this.getPagAtual()+1 ); 
             
               System.out.println(" A página Atual é: " + this.getPagAtual());
          
          
                
                   
                 
    }

    @Override
    public void voltarpagina() {
        if(this.getAberto() == true)
        
            System.out.println(" voltar a página: ");
            
          while(this.getPagAtual() > 0)
          
              this.setPagAtual(this.getPagAtual() - 1 ); 
             
               System.out.println(" A página Atual é: " + this.getPagAtual());
          
    }



}
