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
public abstract class Taylor {
    private static int k;
    private static double x;
    
    public Taylor(int k,double x){
        this.x = x;
        this.k=k;
    }
    
    public int factorial(int n){
        int total=1;
        for(int i=1;i<=n;i++){
            total = total*i;
        }
        return total;
    }
    
    public void setIter(int k ){
        this.k = k;
    }
    
    public int getIter(){
        return k;
    }
    
    public void setValue(double x){
        this.x=x;
    }
    
    public double getValue(){
        return x;
    }
    
    public abstract void printValue();
    
    public abstract double getAprox();
}
