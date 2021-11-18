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
public class CashRegister {
    private double purchase;
    private double payment;
    private double tax;
    private double taxRate;

    public CashRegister(double taxRate){
        this.taxRate=(taxRate/100); 
    }
    public void recordPurchase(double price){
        purchase = purchase + price;
    }
    public void recordTaxablePurchase(double price){
        purchase = purchase + price;
        tax = tax + price*taxRate;
    }
    public double getTotalTax(){
        return tax;
    }
    public void enterPayment(double pay){
        payment = payment+ pay;
    }
    public double giveChange(){
        double change = payment - purchase-tax;
        purchase = 0;
        payment = 0;
        return change;
    }
    
}
