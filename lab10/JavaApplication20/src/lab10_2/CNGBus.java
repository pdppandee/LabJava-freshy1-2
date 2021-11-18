/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_2;

/**
 *
 * @author USER
 */
public class CNGBus extends Bus implements LiquidFuel{
    private double range;
    private int emissionTier;

    
    public CNGBus(int capacity, double cost, double range, int emissionTier){
        super(capacity,cost);
        this.emissionTier=emissionTier;
        this.range = range;
    }
    
    @Override
    public double getRange(){
        return range;
        
    }

    @Override
    public double getAccel() {
       return 3.0;
    }
    
    @Override
    public int getEmissionTier() {
       return emissionTier;
    }
    
}
