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
public class Customer {
    private String name, tel;
    
    public Customer(String name,String tel){
        this.name = name;
        this.tel = tel;
        
    }
    
    @Override public String toString(){
        return name + " tel : " + tel;
    }
    
}
