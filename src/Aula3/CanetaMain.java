/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula3;

/**
 *
 * @author marce
 */
public class CanetaMain {
    public static void main(String[]args){
        Caneta c1= new Caneta();
       /* c1.cor="Azul";
        c1.ponta=0.5;
        c1.tampada=false; erro pois estavam em privado 
       */ 
       c1.modelo = "Bic Transparente";
       c1.cor = "Azul";
       c1.carga =80;
     //  c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
