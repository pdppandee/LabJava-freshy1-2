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
public class Sine extends Taylor{

    public Sine(int k, double x) {
        super(k, x);
    }
    
     @Override
    public double getAprox() {
       double ans = 0.0;
       for(int n =0 ; n<=this.getIter();n++){
           ans += ((Math.pow((-1), n)* Math.pow(this.getValue(),2*n+1))/(super.factorial(2*n+1)));
       }
        return ans;
    }
     @Override
    public void printValue() {
     System.out.println("Value from Math.sin() is " + Math.sin(super.getValue())+".");
     System.out.println("Approximated value is "+this.getAprox()+".");
    }

   
}
