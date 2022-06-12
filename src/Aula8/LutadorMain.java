/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula8;

import Aula7.*;

/**
 *
 * @author MARCELO
 */
public class LutadorMain {
    public static void main(String[] args){
        
        Lutador l[] = new Lutador [6];        
        l[0] = new Lutador ("PrettyBoy" , "França ",31 ,1.75d, 68.9d , 11 , 3 , 1);
        l[1] =  new Lutador ("Putscript","Brasil",29, 1.68d , 57.8d , 14 , 2, 3);
        l[2] = new Lutador ("Snapshadow","EUA",35, 1.65d , 80.9d , 12 , 3,1);
        l[3] = new Lutador ("DeadCode","Austrália", 28 , 1.93d , 81.6d, 13 , 0,2);
      
        Luta UEC01= new Luta();
        UEC01.marcarLuta(l[1], l[1]);
        UEC01.lutar();
        l[1].status();
        l[1].status();
    }
}
