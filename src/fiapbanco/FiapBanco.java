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
public class FiapBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Conta cc = new Conta();
        cc.depositar(50);
        cc.setAgencia(123);
        cc.setNumero(321);
        
        cc.depositar(100);
        
        System.out.println(cc.getSaldo());
        
        Conta poupanca = new Conta(111, 222, 1000);
        
        poupanca.retirar(100);
        
        System.out.println(poupanca.getSaldo());*/
        
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(500);
        
        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(500);
        
        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);
        
        System.out.println("Conta1: " + conta1.getSaldo());
        System.out.println("Conta2: " + conta2.getSaldo());
        System.out.println("Conta3: " + conta3.getSaldo());
    }
    
}
