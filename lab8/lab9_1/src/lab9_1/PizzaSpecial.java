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
public class PizzaSpecial extends Pizza {
    private String special;

    public PizzaSpecial(String name, int price,String special) {
        super(name, price);
        this.special = special;
    }
    @Override
    public String toString(){
        return super.toString()+" special : "+special;
    }
}
