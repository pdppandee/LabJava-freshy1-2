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
public class Secretary extends Employee implements Evaluation{
    private int typingSpeed;
    private int[] score;
    
    public Secretary(String name,int salary, int[] score, int typingSpeed){
        super(name,salary);
        this.score=score;
        this.typingSpeed=typingSpeed;
        
    }
    @Override
    public double evaluate() {
        double sum = 0;
        for(int i : score){
            sum += i;
        }
        return sum;
    }

    @Override
    public char grade(double sum) {
        if(sum>=90){
            this.setSalary(18000);
            return 'P'; 
        }
        else{
            return 'F';
        }
         
    }
    
    
}
