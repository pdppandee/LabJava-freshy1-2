/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2;

/**
 *
 * @author USER
 */
public class MagicSquare {

    int[][] data;
    
    public MagicSquare(int n){
        data = new int[n][n];
        int i=n-1;
        int j=n/2;
        for(int k=1;k<=Math.pow(n,2);k++){
            if (data[i][j]==0){
                data[i][j] = k;
                if (data[i+1>=n ? 0 : i+1][j+1>=n ? 0 : j+1]==0){
                    i = i+1>=n ? 0 : i+1;
                    j = j+1>=n ? 0 : j+1;
                }
                else{
                    i = i-1<0 ? n-1 : i-1;
                }
            }
        }
    }
    
    public String toString(){
        String table = "";
        for(int[] e : data){
            for(int i : e){
                table+=i+"\t";
            }
            table+="\n";
        }
        return table;
    }
    
}
