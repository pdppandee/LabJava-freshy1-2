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
public class Letter {
    private String from,to;
    private String letterBody = "";
    public Letter(String from, String to){
        this.from = from;
        this.to = to;
    }
    
    public void addLine(String line){
        letterBody = letterBody+line+'\n';
    }
    
    public String getText(){
       String header = "Dear " + to + "\n\n";
       String footer = "\nSincerely,\n\n" + from;
       String merged = header + letterBody + footer;
       return(merged);
    } 
}
