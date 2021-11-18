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
public class Cosine extends Taylor{

    public Cosine(int k, double x) {
        super(k, x);
    }
    
    @Override
    public double getAprox() {
        double ans = 0;
       for(int n =0 ; n<=super.getIter();n++){
           ans += (Math.pow(-1, n)* Math.pow(super.getValue(),2*n)/super.factorial(2*n));
       }
        return ans;
    }
     @Override
    public void printValue() {
     System.out.println("Value from Math.cos() is " + Math.cos(super.getValue())+".");
     System.out.println("Approximated value is "+getAprox()+".");
    }

    
    
}
