/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_2;

/**
 *
 * @author USER
 */
public abstract class Animal {
    private String name;//กำหนดตัวแปล ชื่อ
    public Animal(String name){ //กำหนด constructor
        this.name = name;
    }
   
    public void setName(String name){
        this.name =name;//เมธอดตั้งชื่อ
    }
    public String getName(){
        return name; //เมธอดเรียกชื่อนั้น
    }
    /*
    abstract void setName(String name);
    
    abstract String getName();
    */
}
