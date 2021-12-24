/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiapbanco;

/**
 *
 * @author pedrobarossi
 */
public class Conta {
    
    int numero, agencia;
    double saldo;
    
    public Conta (){}
    
    public Conta (int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
       
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void retirar(double valor) {
        saldo -= valor;
    }
    
    public double verificarSaldo(){
        return saldo;
    }
    
}
