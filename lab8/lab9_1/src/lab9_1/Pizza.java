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
public class Pizza {
    private String name;
    private double price;
    
    public Pizza(String name,double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return (name+" price : "+price);
    }
    
    public double getPrice(){
        return price;
    }
}
