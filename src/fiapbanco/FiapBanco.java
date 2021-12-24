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
        Conta cc = new Conta(1, 12, 100);
        cc.depositar(50);
        System.out.println(cc.verificarSaldo());
        
        Conta poupanca = new Conta(2, 12, 1000);
        poupanca.retirar(100);
        System.out.println(poupanca.verificarSaldo());
    }
    
}
