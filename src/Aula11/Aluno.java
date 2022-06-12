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
public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;

  


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
     
   public void pagarMensalidade(){
       
       /* System.out.println(" Pagando a Mensalidade do Aluno: " + this.nome); na classe pessoa a variável nome deve estar em
       protegido para ser usada sem metodo get set, se estiver em privado não será possível
       .*/       
       
       System.out.println(" Pagando a Mensalidade do Aluno: " + this.nome);
       
   }
 
    
    
    
}
