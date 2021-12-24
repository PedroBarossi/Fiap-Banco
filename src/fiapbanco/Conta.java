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
    public int numero;
    /**
     * Número da agência
     */
    public int agencia;
    /**
     * Saldo da conta
     */
    public double saldo;
    
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
    
    /**
     * Verifica o saldo da conta
     * @return Valor do saldo da conta
     */
    public double verificarSaldo(){
        return saldo;
    }
    
}
