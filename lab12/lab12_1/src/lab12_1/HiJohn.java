package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class HiJohn {
    public static void main(String[] args) throws FileNotFoundException {
       String str;
       int charCnt = 0;
       int wordCnt= 0;
       int lineCnt = 0;
       Scanner in = new Scanner(System.in);
       PrintWriter output = new PrintWriter("text.txt");
       str = in.nextLine();
       
       while (!str.equals("quit")){
           output.println(str);
           str = in.nextLine();
           lineCnt++;
       }
       File file = new File("text.txt");
       PrintWriter out = new PrintWriter(file);
       Scanner read = new Scanner(file);
       
       output.close();
       while(read.hasNextLine()){
           String line = read.nextLine();
           String[] words = line.split(" ");
           wordCnt += words.length;
           charCnt += line.length();     
       }
       out.close();
       System.out.println("Total characters : " + charCnt);
       System.out.println("Total words : " + wordCnt);
       System.out.println("Total lines : " + lineCnt);

    }
    
}
