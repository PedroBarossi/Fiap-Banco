/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiapbanco;

/**
 *
 * @author ramos
 */
public class ContaCorrente extends Conta {
        
        private String tipo;
        private double chequeEspecial;
        
        public ContaCorrente (){}
        
        public ContaCorrente(String tipo){
            this.tipo = tipo;
        }
        
        public String getTipo(){
            return tipo;
        }
        
        public void setTipo (String tipo){
            this.tipo = tipo;
        }
        
        public double getChequeEspecial(){
            return chequeEspecial;
        }
        
        public void setChequeEspecial(double chequeEspecial){
            this.chequeEspecial = chequeEspecial;
        }
        
        //comportamentos exclusivos da conta corrente
        public double getSaldoDisponivel(){
            return getSaldo() + this.chequeEspecial;
        }
        
        //sobrescrever o método de retirada (adiciona taxa)
        @Override
        public void retirar(double valor){
            valor += 10;
            super.retirar(valor);
        }
}