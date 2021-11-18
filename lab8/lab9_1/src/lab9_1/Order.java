/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Order {
    public static int cntOrder = 0 ; //to generate id of order
    private int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<>();
    
    public Order (Customer c){
        this.c=c;
        cntOrder++;
    }
    
    public void addPizza(Pizza piz){
        p.add(piz);
        
    }   
    
    public String getOrderDetail(){
        id = cntOrder;
        String order = "Order id : " + id +"\n"+c.toString() + "\n";
        for (Pizza pizza : p){
            order += pizza.toString()+"\n";
        }
        order += "Total pieces : "+ p.size()+"\n" + "Total cost : " + calculatePayment();
        return order;
    }
    
    public double calculatePayment(){
        double cost = 0;
        for(Pizza pizza : p){
            cost += pizza.getPrice();
        }
        if(c instanceof GoldCustomer){
            GoldCustomer gc = (GoldCustomer) c;
            return cost*((100-gc.getDiscount())/100);
        }
        else 
            return cost;
        
    }

    
    
}
