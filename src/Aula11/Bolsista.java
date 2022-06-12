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
public final class Bolsista extends Aluno {
    
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        
    
        System.out.println(" Renovando a bolsa de " + this.nome);
    
    
    }
    
    @Override
    
public final void pagarMensalidade(){
    
    System.out.println( this.nome+ " é bolsista, pagamento facilitado " );
    
}
    
}
