/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_2;

/**
 *
 * @author USER
 */
public class Tester {
    public static void main(String[] args){
        Expo exp = new Expo(0,6);
        exp.printValue();
        Sine s = new Sine(0,1);
        s.printValue();
        Cosine cs = new Cosine(0,1);
        cs.printValue();
        
    }
    
}
