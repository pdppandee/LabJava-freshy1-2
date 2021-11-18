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
public class Hybrid extends Bus implements LiquidFuel,Electric {
    private double voltage;
    private double range;
    private int emissionTier;

    public Hybrid(int capacity, double cost,double voltage,double range, int emissionTier) {
        super(capacity, cost);
        this.range=range;
        this.emissionTier = emissionTier;
        if(voltage < Electric.LOW_VOLTAGE){
            voltage = Electric.LOW_VOLTAGE ; 
        }
        if(voltage > Electric.HIGHT_VOLTAGE){
            voltage = Electric.HIGHT_VOLTAGE;
        }
    }

    @Override
    public double getAccel() {
        return 4.0;   
    }

    @Override
    public double getRange() {
        return range;  
    }

    @Override
    public int getEmissionTier() {
        return emissionTier; 
    }

    @Override
    public double getVoltage() {
        return voltage;
    }
    
}
