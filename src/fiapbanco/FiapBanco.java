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
        // TODO code application logic here
        Conta cc = new Conta();
        cc.depositar(50);
        cc.setAgencia(123);
        cc.setNumero(321);
        
        cc.depositar(100);
        
        System.out.println(cc.getSaldo());
        
        Conta poupanca = new Conta(111, 222, 1000);
        
        poupanca.retirar(100);
        
        System.out.println(poupanca.getSaldo());
    }
    
}
