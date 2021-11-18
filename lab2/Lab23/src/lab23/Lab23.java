/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author usci
 */
public class Lab23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH,100);
        int week1 = cal.get(Calendar.DAY_OF_WEEK);
        int day1 = cal.get(Calendar.DAY_OF_MONTH);
        int month1 = cal.get(Calendar.MONTH);
        int year1 = cal.get(Calendar.YEAR);
        System.out.println(week1+" "+day1+" "+month1+" "+year1);
        GregorianCalendar myBirthday = new GregorianCalendar(2000,Calendar.DECEMBER,13);
        myBirthday.add(Calendar.DAY_OF_MONTH,10000);
        int week2 = myBirthday.get(Calendar.DAY_OF_WEEK);
        int day2 = myBirthday.get(Calendar.DAY_OF_MONTH);
        int month2 = myBirthday.get(Calendar.MONTH);
        int year2 = myBirthday.get(Calendar.YEAR);
        System.out.println(week2+" "+day2+" "+month2+" "+year2);
        
        
    }
    
}
