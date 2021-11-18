/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

/**
 *
 * @author usci
 */
public class InsectPopulation {
    private double insect;
    public InsectPopulation(double num){
        insect = num;
    }
    public void breed(){
        insect=insect*2;
        
    }
    public void spray(){
        insect=insect*0.9;
    }
    public double getNumInsect(){
        return insect;
    }
}
