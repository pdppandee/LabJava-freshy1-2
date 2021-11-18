/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

/**
 *
 * @author USER
 */
public class Zeller {
    private static int day;
    private static int month;
    private static int year;
    
    Zeller(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public enum Day {
        SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wesnesday"),THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday");
        public final String days;
        Day(String days){
            this.days = days;
        }
    }
    public String getDayOfWeek(){
        int number = (day+(year%100)+((year%100)/4)+(((month+1)*26)/10)+((year/100)/4)+(5*(year/100)))%7;
            switch (number) {
                case 2 : return "Day of the week is " + Day.MONDAY;
                case 3 : return "Day of the week is " + Day.TUESDAY;
                case 4 : return "Day of the week is " + Day.WEDNESDAY;
                case 5 : return "Day of the week is " + Day.THURSDAY;
                case 6 : return "Day of the week is " + Day.FRIDAY;
                case 0 : return "Day of the week is " + Day.SATURDAY;
                case 1 : return "Day of the week is " + Day.SUNDAY;
            }
            return null ;
    }
}
