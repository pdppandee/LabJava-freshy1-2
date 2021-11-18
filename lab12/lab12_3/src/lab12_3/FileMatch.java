
package lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;


public class FileMatch {
    public static void main(String[] args) {
        ArrayList<AccountRecord> accountRecordArray = new ArrayList<>();
        ArrayList<TransactionRecord> transactionRecordArray = new ArrayList<>();
        
       try{
            File masterFile = new File("master.txt");
            Scanner readMaster = new Scanner(masterFile);
            while(readMaster.hasNextLine()){
                String master = readMaster.nextLine();
                String[] masterSplit = master.split(" ");
                
                int accNo = Integer.parseInt(masterSplit[0]);
                String name = masterSplit[1]+" "+masterSplit[2];
                
                double balance = Double.parseDouble(masterSplit[3]);
                
                AccountRecord accRec = new AccountRecord(accNo, name, balance);
                accountRecordArray.add(accRec);
                }
            
            File transFile = new File("trans.txt");
            Scanner readTrans = new Scanner(transFile);
            while(readTrans.hasNextLine()){
                String trans = readTrans.nextLine();
                String[] transSplit = trans.split(" ");
                int accNo = Integer.parseInt(transSplit[0]);
                double balance = Double.parseDouble(transSplit[1]);  
                if (!transactionRecordArray.isEmpty()) {
                    TransactionRecord lastTrans = transactionRecordArray.get((transactionRecordArray.size()-1));
                    if (lastTrans.getAccountNumber() == accNo) {
                        lastTrans.setBalance(lastTrans.getBalance()+balance);
                        lastTrans.setTransCnt(lastTrans.getTransCnt()+1);
                    }
                    else {
                        TransactionRecord transRec = new TransactionRecord(accNo, balance);
                        transactionRecordArray.add(transRec);
                    }
                }
                else {
                    TransactionRecord transRec = new TransactionRecord(accNo, balance);
                    transactionRecordArray.add(transRec);
                }
            }
            
            for (AccountRecord acc : accountRecordArray) {
            for (TransactionRecord transRec : transactionRecordArray) {
                if (acc.getAcctNo() == transRec.getAccountNumber()) {
                    acc.combine(transRec);
                    break;
                    }
                }
            }
       }
        catch(FileNotFoundException e){
            System.out.println("Error " + e.getMessage());
        }
       catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    
    try (RandomAccessFile r = new RandomAccessFile("newMaster.dat", "rw")) {
        for (AccountRecord acc : accountRecordArray) {
                r.writeInt(acc.getAcctNo());
                r.writeChar('\n');
                String name = acc.getName();
                for (int i = name.length(); i < 30; i++) {
                    name += " ";
                }
                r.writeChars(name);
                r.writeChar('\n');
                r.writeDouble(acc.getBalance());
                r.writeChar('\n');
                r.writeInt(acc.getTransCnt());
                r.writeChar('\n');
        }
    }
        catch (FileNotFoundException e){
            System.out.println("Error" + e.getMessage());
}
        catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    ArrayList<AccountRecord> accountRecordRead = new ArrayList<>();
        try (RandomAccessFile r = new RandomAccessFile("newMaster.dat", "r")) {
            while (r.getFilePointer() < r.length()) {
                int accNo = r.readInt();
                r.seek(r.getFilePointer()+2);
                String name = r.readLine();
                Double balance = r.readDouble();
                r.seek(r.getFilePointer()+2);
                int transCnt = r.readInt();
                r.seek(r.getFilePointer()+2);
                AccountRecord acc = new AccountRecord(accNo, name, balance,transCnt);
                accountRecordRead.add(acc);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        double balance = 0.0;
        int noTrans = 0;
        for (AccountRecord acc : accountRecordRead) {
            //System.out.println(balance);
            balance += acc.getBalance();
            if (acc.getTransCnt() == 0) {
                noTrans++;
            }
        }
        System.out.println("Total Account Record : " + accountRecordRead.size());
        System.out.println("Total Balance : " +balance);
        System.out.println("No transaction : " + noTrans + " account.");
}
}