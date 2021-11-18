/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11_2;


public class Fish extends Animal implements CanSwim{
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim(Terrain terrain) {
        if(terrain.canMove(this)) {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can swim on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        } else {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can not swim on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        }
    }
}
