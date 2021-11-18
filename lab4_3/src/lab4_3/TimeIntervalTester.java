/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TimeIntervalTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start time:");
        int start = sc.nextInt();
        System.out.print("Enter end time:");
        int end = sc.nextInt();
        TimeInterval tester = new TimeInterval(start,end);
        System.out.println(tester.getHours()+ " hours" + tester.getMinutes()+ " minutes");
        
    }
}
