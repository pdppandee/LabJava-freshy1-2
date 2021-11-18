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
public class Expo extends Taylor{
    public Expo(int x, double k){
    super(x,k);    
    }
    
    @Override
    public double getAprox() {
        double ans = 0;
        for (int n = 0; n<=super.getIter(); n++ ){
            ans += Math.pow(super.getValue(),n)/super.factorial(n); 
        }
        return ans;  
    }
    
        @Override
    public void printValue() {
     System.out.println("Value from Math.exp() is " + Math.exp(super.getValue())+".");
     System.out.println("Approximated value is "+getAprox()+".");
    }
    
}
