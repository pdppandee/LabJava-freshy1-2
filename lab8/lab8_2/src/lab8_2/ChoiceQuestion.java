/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ChoiceQuestion extends Question {
    ArrayList<String> choices = new ArrayList<String>();
    
    public ChoiceQuestion(String text) {
        super(text);
    }
    
    public void addChoice(String choice,boolean correct){
        choices.add(choice);
        if (correct==true){
            super.setAnswer(choice);
        }
    }
    
    @Override
    public void display(){
        super.display();
        for (int i=0; i < choices.size(); i++){
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
    
    @Override
    public boolean checkAnswer(String response){
        boolean chk = choices.get(Integer.parseInt(response)-1).endsWith(super.answer);
        return chk;
    }
    
    
}
