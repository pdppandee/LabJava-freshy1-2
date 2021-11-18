/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BusTester {
     public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();
        Hybrid hybridbus = new Hybrid(45,1.2E6,Electric.HIGHT_VOLTAGE ,150,1);
        CNGBus cngbus = new CNGBus(50, 1E6, 200, 2);
        arr.add( hybridbus );
        arr.add(cngbus);
        
        for (Bus bus : arr){
            System.out.println("ID : " + bus.getID());
            if(bus instanceof CNGBus){
                 System.out.println("Emission Tier : " + ((CNGBus)bus).getEmissionTier());
            }
            else if(bus instanceof Hybrid){
                 System.out.println("Emission Tier : " + ((Hybrid)bus).getEmissionTier());
            }
            System.out.println("Accel : " + bus.getAccel());
           
          }
}
}
