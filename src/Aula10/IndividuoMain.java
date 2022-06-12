/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10;

import Aula10.*;

/**
 *
 * @author MARCELO
 */
public class IndividuoMain {
    public static void main(String[]args){
        
    
    Pessoa p1= new Pessoa();
    Aluno p2= new Aluno();
    Professor p3 = new Professor();
    Funcionario p4= new Funcionario();
    
    p1.setNome("Marcelo");
    p1.setIdade(21);
    p1.setSexo("M");
    p2.setNome("João");
    p2.setCurso("Informatica");
    p2.setIdade(32);
    p2.setSexo("M");
    p3.setNome("José");
    p3.setIdade(40);
    p3.setSexo("M");
    p3.setSalario((float) 2500.75);
    p3.receberAum(120F);
    p4.setNome("Julia");
    p4.setIdade(21);
    p4.setSexo("F");  
     p4.setSetor(" Estoque ");  
    
     
     
    System.out.println(p1.toString());
    
    System.out.println(p2.toString());
    
    System.out.println(p3.toString());
    
    System.out.println(p4.toString());
      
    }
    }
