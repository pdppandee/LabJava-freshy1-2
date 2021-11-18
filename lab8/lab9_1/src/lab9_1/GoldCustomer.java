/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_1;

/**
 *
 * @author USER
 */
public class GoldCustomer extends Customer{
    private double discount;

    public GoldCustomer(String name, String tel, int discount) {
        super(name, tel);
        this.discount = discount;
    }
    @Override
    public String toString(){
        return super.toString()+" discount : "+discount;
    }

    public double getDiscount() {
        return discount;
    }
    
}
