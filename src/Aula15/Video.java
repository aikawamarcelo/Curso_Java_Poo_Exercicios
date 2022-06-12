/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula15;

import Aula14.*;

/**
 *
 * @author MARCELO
 */
public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao= 0;
        this.views= 0;
        this.curtidas= 0;
        this.reproduzindo= false;
    }
    
    

    protected String getTitulo() {
        return titulo;
    }

     protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     protected int getAvaliacao() {
        return avaliacao;
    }

     protected void setAvaliacao(int avaliacao) {
         int nova;
         
        nova= (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

     protected int getViews() {
        return views;
    }

     protected void setViews(int views) {
        this.views = views;
    }

     protected int getCurtidas() {
        return curtidas;
    }

     protected void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

     protected boolean isReproduzindo() {
        return reproduzindo;
    }

     protected void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override
    public void play() {
        
        this.reproduzindo=true;
        
        
    }

    @Override
    public void pause() {
        
        this.reproduzindo=false;
        
    }

    @Override
    public void like() {
        
        this.curtidas++;
        
        
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ""
                + "\n , avaliacao=" + avaliacao + ""
                + "\n     , views=" + views + ""
                + "\n,   curtidas=" + curtidas + ""
                + "\n, reproduzindo=" + reproduzindo + '}';
    }
    
}


/* O sobrescrever da classe vídeo demonstra um polimorfismo de sobreposição, ou seja um método sobrescrito com parâmetros 
iguais em classes diferentes, métodos com o mesmo comportamento*/