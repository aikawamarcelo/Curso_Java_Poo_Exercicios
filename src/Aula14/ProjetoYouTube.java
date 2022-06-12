/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14;

/**
 *
 * @author MARCELO
 */
public class ProjetoYouTube {
    public static void main(String[]args){
    Video v[]=new Video[3];
     v[0]= new Video("Aula 1 de PHP");
     v[1]= new Video("Aula 2 de Javascript");
     v[2]= new Video("Aula 3 de Python");
     
    Gafanhoto g[] = new Gafanhoto[2];
    g[0]=new Gafanhoto("Jubileu",22,"M","amei");
    g[1]=new Gafanhoto("Creuza",24,"F","lovei");
    //g[1].setExperiencia(100);
    //g[2].setExperiencia(200);
    System.out.println(g[0].toString());
    System.out.println(g[1].toString());
     
    // System.out.println(v[0].toString());
    
    
    }
}
