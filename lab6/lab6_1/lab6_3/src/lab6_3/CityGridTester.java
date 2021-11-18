/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

/**
 *
 * @author USER
 */
public class CityGridTester {
   public static void main(String[] args) {
   double ave=0;
        int max=0;
        CityGrid man = new CityGrid(20,20);
        for (int i=0 ; i<10000 ; i++){
            for (int j=0 ; j<1000 ; j++){
                if(man.isInCity()){
                 man.walk();
                 ave++;
                }
                else{
                 man.reset();
                 if(max<j){
                     max=j;
                 }
                 break;
                }
            }
        }
        System.out.printf("Average number of steps that a person can take and is still in the city: %.2f",ave/10000);
        System.out.println("\nMaximum number of steps that a person can take and is still in the city: "+max);
    }
}
