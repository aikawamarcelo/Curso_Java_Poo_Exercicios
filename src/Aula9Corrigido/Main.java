/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9Corrigido;

import Aula9.*;

/**
 *
 * @author MARCELO
 */
public class Main {
public static void main(String[]args){
    Pessoa[]p = new Pessoa[2];
     Livro []l =new Livro[3];
   p[0]= new Pessoa("Marcelo",21,"Masculino"); 
   p[1]= new Pessoa("Gabriela",20,"Feminino");
   
   l[0]= new Livro(" Dom Quixote","Marcelo Aikawa",100,p[0]);
   l[1]= new Livro(" A princesa e o sapo ","Gabriela",50,p[1]);
    
   l[0].abrir();
   l[0].folhear(100);
   l[0].avancarpagina();
   System.out.println(l[0].detalhes());
    


}    
}
