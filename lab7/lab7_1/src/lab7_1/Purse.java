/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
//
public class Purse {
  
    private ArrayList<String> purse = new ArrayList<>();
    private ArrayList<String> reversePurse = new ArrayList<>();
    
    public void addCoins(String coinName){
        purse.add(coinName);
    }
    @Override
    public String toString(){
        return "purse"+purse.toString();
    }
    public ArrayList<String> reverse(){
      
        for (int i = purse.size()-1;i>=0;i-- ){
            reversePurse.add(reversePurse.get(i));
        }
        return reversePurse;
    }
    public void transfer(Purse other){
        for(int i=0; i<purse.size();i++){
            other.addCoins(purse.get(i));
            //purse.remove(0);
        }
        for(int i=0; i<purse.size()+3;i++){
            purse.remove(0);
        }
        
    }
    public boolean sameContents(Purse other){
        int same =0;
        if(purse.size()!= other.purse.size()){
            return false;
        }
        else{
            for(int i=0;i<purse.size();i++){
                if(purse.get(i)== other.purse.get(i)){
                    same+=1;
                }
                else{
                    same-=1;
                }
            }
            return same == purse.size();
        }
    }

   
    public boolean sameCoins(Purse other){
        int coin1=0;
        int coin2=0;
        if(purse.size()!=other.purse.size()){
            return false;
        }
        else{
            for(int i=0;i<purse.size();i++){
                switch(other.purse.get(i)){
                    case "Quater":{coin1+=1;}
                    case "Dime":{coin1+=1;}
                    case "Nickel":{coin1+=1;}
                    case "Penny": {coin1+=1;}
                }
                switch(purse.get(i)){
                    case "Quater":{coin2+=1;}
                    case "Dime":{coin2+=1;}
                    case "Nickel":{coin2+=1;}
                    case "Penny": {coin2+=1;}
                }
            }
            return coin1==coin2;
        }
    }
}
