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
public class InsectPopulationTester {
    public static void main(String[] args) {
        InsectPopulation tester = new InsectPopulation(10);
        for (int i =1 ; i <=3 ; i++){
            tester.breed();
            tester.spray();
            System.out.println("Number of insects :" + tester.getNumInsect());
        }
    }
}
