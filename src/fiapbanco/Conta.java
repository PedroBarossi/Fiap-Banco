/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiapbanco;

/**
 *Classe que abstrai uma conta bancária
 * @author pedrobarossi
 * @version 1.0
 */
public class Conta {
    
    /**
     * Número da conta
     */
    private int numero;
    /**
     * Número da agência
     */
    private int agencia;
    /**
     * Saldo da conta
     */
    private double saldo;
    
    /* Contrutores
    *da classe Conta
    */

    /**
     *
     */

    public Conta (){}
    
    /**
     *
     * @param numero
     * @param agencia
     * @param saldo
     */
    public Conta (int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
       
    }
    
    /**
    * Deposita um valor ao saldo da conta
    * @param valor Valor a ser depositado
    */
    public void depositar(double valor) {
        saldo += valor;
    }
    
    /**
    * Retira um valor do saldo da conta
    * @param valor Valor a ser retirado
    */
    public void retirar(double valor) {
        saldo -= valor;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia (int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public class ContaCorrente extends Conta {
        
        private String tipo;
        private double chequeEspecial;
        
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
}
