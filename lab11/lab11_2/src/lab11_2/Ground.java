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
public class Ground extends Terrain{

    public Ground(String name) {
        super(name); //constructor จาก terrain ซึ่งเป็น superclass ของ ground
    }

    @Override //override method จาก terrian 
    boolean canMove(Animal animal) {
       if(animal instanceof CanWalk) { //เช็คว่า สัตว์อยู่ใน class canwalk มั้ย
            return true;
        } 
            return false;
    }
}
