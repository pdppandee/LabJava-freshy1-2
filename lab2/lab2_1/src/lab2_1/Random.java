/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

import java.awt.Rectangle;

/**
 *
 * @author usci
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.util.Random x = new java.util.Random();
        java.util.Random y = new java.util.Random();
        java.util.Random width = new java.util.Random();
        java.util.Random height = new java.util.Random();
        Rectangle r1 = new Rectangle(x.nextInt(50)+1,y.nextInt(50)+1,width.nextInt(50)+1,height.nextInt(50)+1);
        Rectangle r2 = new Rectangle(x.nextInt(50)+1,y.nextInt(50)+1,width.nextInt(50)+1,height.nextInt(50)+1);
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println("Is the intersected rectangle empty?:"+r3.isEmpty());
        
    }
    
}
