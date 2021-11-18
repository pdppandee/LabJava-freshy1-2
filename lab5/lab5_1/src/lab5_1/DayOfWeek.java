/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year (e.g., 2012):");
        int year = input.nextInt();
        System.out.print("Enter month (1-12):");
        int month = input.nextInt();
        System.out.print("Enter day of the month (1-31):");
        int day = input.nextInt();
        
        Zeller a = new Zeller(day,month,year);
        System.out.println(a.getDayOfWeek());
        
    }
 
    
}
