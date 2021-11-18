/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_1;

/**
 *
 * @author USER
 */
public class CannonBallTester {
    public static void main(String[] args) {
        CannonBall ball = new CannonBall(100);
        ball.simulatedFlight();
        System.out.println("Distance from calculus equation: "+ball.calculusFlight(ball.getSimulatedTime()));
    }
}
