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
public class Employee {
    private String name;
    private int salary;
    public Employee(String name,int salary){
            this.name=name;
            this.salary = salary;
        
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    
    @Override
    public String toString(){
        return name+"\nsalary = "+salary;  
    }
}
