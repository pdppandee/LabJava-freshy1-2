/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

/**
 *
 * @author USER
 */
public class TimeInterval {
    private int start;
    private int end;
    //private int minStart;
    //private int minEnd;
    
    public TimeInterval(int start, int end){
        this.start=start;
        this.end=end;
    }
    public int getHours(){
        double minStart = Math.floor((start/100)*60) + (start%100);
        double minEnd = Math.floor((end/100)*60) + (end%100);
        double hours = Math.floor(minEnd -minStart)/60;
        return (int)hours;
    }
    public int getMinutes(){
        double minStart = Math.floor((start/100)*60)+ (start%100);
        double minEnd = Math.floor((end/100)*60) + (end%100);
        double min = (minEnd -minStart)%60;
        return (int)min ;
    }
}
