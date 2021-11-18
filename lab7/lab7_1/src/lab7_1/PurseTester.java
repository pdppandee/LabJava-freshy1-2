/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1;

/**
 *
 * @author USER
 */
public class PurseTester {
    public static void main(String[] args) {
        
     Purse purse1 = new Purse();
        Purse purse2 = new Purse();

        purse1.addCoins("Dime");
        purse1.addCoins("Dime");
        purse1.addCoins("Penny");
        purse1.addCoins("Quater");


        purse2.addCoins("Dime");
        purse2.addCoins("Dime");
        purse2.addCoins("Penny");
        purse2.addCoins("Quater");


        System.out.println(purse1.sameContents(purse2));

    }
        
        
    }
  
