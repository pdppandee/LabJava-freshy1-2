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
public class Pool extends Terrain{
   
    public Pool(String name){
        super(name);
    }
    @Override
    public boolean canMove(Animal animal){
        if(animal instanceof CanSwim ) { 
            return true;
        } 
            return false;
    }
    
}
