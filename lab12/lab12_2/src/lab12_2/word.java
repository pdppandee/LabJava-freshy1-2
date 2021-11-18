/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class word {

  
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<String>();
        ArrayList<String> not = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input= in.nextLine();
        String[] inputlist = input.split(" ");
      
        try{
            File file = new File("wordlist.txt");
            Scanner word = new Scanner(file);
            String str = word.nextLine();

            while (word.hasNextLine()){
                wordlist.add(str);
                str = word.nextLine();  
                }
            
            
            for (int i = 0; i < inputlist.length;i++){
                if(!wordlist.contains(inputlist[i])){
                    not.add(inputlist[i]);
                }
            }
         
            System.out.println("Words not contained: ");
            if (not.size()>0){
                for (int k = 0;k<not.size();k++){
                    System.out.println(not.get(k));
                }
            }
            else {
                System.out.println("N/A");
                    }
            word.close();
        }
        
//        catch(IOException e){
//            System.out.println(e);
//        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
//        /*catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }*/
//        catch(Exception e){
//            System.out.println(e);
//       }
       // System.out.println(inputlist);
    }
}