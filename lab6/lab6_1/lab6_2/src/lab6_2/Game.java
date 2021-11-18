/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */

public class Game {
      private int input;
      
      /*private int paper = 1;
      private int scissor = 2;
       

      public Game(){
          
      }*/
      public void play(){
          Random rand = new Random();
          int userWin = 0;
          int comWin = 0;
          /*do { Scanner input = new Scanner(System.in);
          System.out.println("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSOR :" + input);
          input >=0 || input <3
          }*/
          while (true)
          {     Scanner in = new Scanner(System.in);
                System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSOR :" );
                String user=in.next();
                if (null != user)
                {   switch(user) {
                        case "0" : System.out.println("You enter : ROCK"); break;
                        case "1" : System.out.println("You enter : PAPER"); break;
                        case "2" : System.out.println("You enter : SCISSOR"); break;
                        default : continue;
                        }
                }  
                
                int com = rand.nextInt(3);
                if (com==0){ System.out.println("Computer : ROCK");}
                if (com==1){ System.out.println("Computer : PAPER");}
                if (com==2){ System.out.println("Computer : SCISSOR");}
              
                int userInt = Integer.parseInt(user);
                
                if ( (userInt==0 && com==2) || (userInt==1 && com==0) || (userInt==2 && com==1) ){
                    System.out.println("You win!");
                    userWin = userWin+1;
                }
                if ( (userInt==2 && com==0) || (userInt==0 && com==1) || (userInt==1 && com==2) ){
                    System.out.println("You lose!");
                    comWin = comWin+1;
                }
                if ( (userInt==2 && com==2) || (userInt==1 && com==1) || (userInt==0 && com==0) ){
                    System.out.println("It's a tie.");
                }
                
                if ( (userWin==3 && comWin==2) || (userWin==3 && comWin ==1) || (userWin==3 && comWin ==0) ){
                    System.out.println("-------------------------------------");
                    System.out.println("Congrats! You win.");
                    System.out.println("User Score: " + userWin);
                    System.out.println("Computer Score: " + comWin);
                    break;
                }
                if ( (userWin==0 && comWin==3) || (userWin==1 && comWin ==3) || (userWin==2 && comWin ==3) ){
                    System.out.println("-------------------------------------");
                    System.out.println("Too bad! You lose.");
                    System.out.println("User Score: " + userWin);
                    System.out.println("Computer Score: " + comWin);
                    break;
                }
                
                    
                       
                        
                    
            }
              
          
        }
          
}
    
        
    

