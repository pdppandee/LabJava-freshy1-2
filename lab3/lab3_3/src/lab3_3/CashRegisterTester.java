/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

/**
 *
 * @author USER
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister tester = new CashRegister(7);
        tester.recordPurchase(50);
        tester.recordPurchase(10);
        tester.recordTaxablePurchase(20);
        tester.enterPayment(100);
        System.out.println("Your Change is " + tester.giveChange());
        
        
    }
    
}
