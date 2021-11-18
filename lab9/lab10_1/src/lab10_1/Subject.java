/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_1;

/**
 *
 * @author USER
 */
public class Subject implements Evaluation{
    private String subjName;
    private int[] score;
    
    public Subject(String subjName ,int[] score){
        this.score=score;
        this.subjName=subjName;
    }

    @Override
    public double evaluate() {
        double sum = 0;
        for(int i : score){
            sum += i;
        }
        double avg;
        avg = sum/score.length;
        return avg;
    }

    @Override
    public char grade(double avg) {
        if(avg>=70){
            return 'P'; 
        }
        else{
            return 'F';
        }
    }
    
    @Override
    public String toString(){
        return subjName;
    }    
    
}
