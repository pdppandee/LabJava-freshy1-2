
package lab8_1;

public class Truck extends Car {
    private double M_weight;
    private double weight;
    
    public Truck(double gas, double efficiency, double M_weight, double weight){
        super(gas,efficiency);
        this.M_weight = M_weight;
        this.weight = weight;
        if(weight > M_weight) M_weight = weight;    
    }
    
    @Override public void drive(double distance){
        double use ;
        if(weight>20){
            use = (distance/super.getEfficiency())*1.3;
        }
        else if (weight >= 10){
            use = (distance/super.getEfficiency())*1.2;
        }
        else if(weight>=1){
           use = (distance/super.getEfficiency())*1.1; 
        }
        else use = (distance/super.getEfficiency());
    
       if (use > super.getGas()){
            System.out.println("You cannot drive too far, please add gas");
        }
        else{
            double gas = super.getGas()- use;
            super.setGas(gas);
       }
    }
    
}
