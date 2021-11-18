/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_2;

/**
 *
 * @author werapan
 */
public class Sky extends Terrain{
    public Sky(String name) {
        super(name);
    }
    @Override
    public boolean canMove(Animal animal) {
        if(animal instanceof CanFly) { 
            return true;
        } 
        
        return false;
    }
}
