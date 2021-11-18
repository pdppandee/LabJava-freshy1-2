package lab6_3;

import java.util.Random;

 
public class CityGrid {
    private int xCoor; //man in x
    private int yCoor; //man in y
    private int gridSize; //size of the city
    private final int x,y;

    
    public CityGrid(int x,int y){
        xCoor=x/2;
        this.x=x;
        this.y=y;
        yCoor=y/2;
        gridSize = x*y;
        
    }
    
    public void walk(){
        Random rand = new Random();
        int way = rand.nextInt(4);
        if (way == 0) {yCoor += 1;}
        else if (way == 1) {yCoor -= 1;}
        else if (way == 2) {xCoor -= 1;}
        else if (way == 3) {xCoor += 1;}
    }
    
    public boolean isInCity(){
        if((xCoor<0 || xCoor>x) || (yCoor<0 || yCoor>y)){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void reset(){
        xCoor=x/2;
        yCoor=y/2;
    }
       
    
}
