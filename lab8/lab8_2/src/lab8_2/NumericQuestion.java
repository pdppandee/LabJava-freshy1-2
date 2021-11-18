/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;


public class NumericQuestion extends Question {
    
    public NumericQuestion(String text) {
        super(text);
    }
    
    @Override
    public boolean checkAnswer(String response){
        double res = Double.parseDouble(response);
        double ans = Double.parseDouble(super.answer);
        double chk = res - ans;
        return Math.abs(chk) <= 0.01;
    }
    
    
}
