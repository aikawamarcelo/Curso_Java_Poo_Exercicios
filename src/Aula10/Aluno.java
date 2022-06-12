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
public class Aluno extends Pessoa{
    
    private String matricula;
    private String curso;

  


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
     
   public void cancMatr(){
       
       System.out.println(" Matrícula será cancelada! ");
       
   }
 
    
    
    
}
