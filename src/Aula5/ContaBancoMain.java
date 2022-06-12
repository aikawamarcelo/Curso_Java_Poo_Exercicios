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
public class ContaBancoMain {
    public static void main(String[]args){
   // p1 = pessoa 1
        
   
   ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(3333);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(500);
        p2.depositar(400);
        
        p2.sacar(100);
        
        p1.sacar(550);
        p1.fecharConta();
        
        p1.estadoAtual();
   
        p2.estadoAtual();
        
        
    }
}
