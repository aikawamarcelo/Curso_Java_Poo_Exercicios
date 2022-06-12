/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author MARCELO
 */
public class PessoaMain {
   public static void main(String []args){
    
    
   // Pessoa p = new Pessoa(); Classe abstrata , portanto objeto não pode ser implementado
    
  // Pessoa p1 = new Pessoa(); Classe Abstrata
   Visitante v1 = new Visitante(); 
   Aluno a1 = new Aluno();
   Bolsista b1 = new Bolsista();

    v1.setNome("Juvenal");
    v1.setIdade(21);
    v1.setSexo("M");
    
    System.out.println(v1.toString());
    
     a1.setNome("Cláudio");
     a1.setMatricula(1111);
     a1.setCurso("Informática");
     a1.setIdade(16);
     a1.setSexo("M");
     a1.pagarMensalidade();
    

     
     b1.setMatricula(1111);
     b1.setNome(" Jubileu ");
     b1.setBolsa(12.5f);
     b1.setSexo("M");
     b1.pagarMensalidade();
   }
   }
