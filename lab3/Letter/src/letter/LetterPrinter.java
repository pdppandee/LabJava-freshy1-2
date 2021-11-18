/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter;

/**
 *
 * @author usci
 */
public class LetterPrinter {
    public static void main(String[] args){
        Letter x = new Letter("Clarissa","Jade");
        x.addLine("We must find Simon quickly.");
        x.addLine("He might be in danger.");
        System.out.print(x.getText());
    }
}
