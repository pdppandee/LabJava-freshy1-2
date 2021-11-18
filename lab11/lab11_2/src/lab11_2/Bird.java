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
public class Bird extends Animal implements CanFly,CanWalk{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly(Terrain terrain) {
     System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can fly over " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");      
    }

    @Override
    public void walk(Terrain terrain) {
    if(terrain.canMove(this)&& !terrain.getClass().getSimpleName().equals("Sky")) {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can walk on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        } else {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can not walk on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        }
    }

    @Override
    public void run(Terrain terrain) {
        if(terrain.canMove(this) && !terrain.getClass().getSimpleName().equals("Sky")) {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can run on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        } else {
            System.out.println(this.getName() +"(" +this.getClass().getSimpleName()
                    +") can not run on " + terrain.getName() + "("+terrain.getClass().getSimpleName()+")");
        }
    }
    
}
