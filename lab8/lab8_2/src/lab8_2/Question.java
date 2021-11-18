/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

/**
 *
 *  public static void main(String[] args) {
        // TODO code application logic here
    }
 * @author USER
 */
public class Question {
    String text ;
    String answer ;
    
    public Question(String text){
        this.text = text;
        
    }
    public Question() {
        this.text = "";
    }
    
    public void setText(String text){
        this.text=text;
    }
    
//    public String getText(){
//        return text;
//    }
//    
    public void setAnswer(String answer){
        this.answer=answer;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    
    public void display(){
        System.out.println(text);
    }
    


}
