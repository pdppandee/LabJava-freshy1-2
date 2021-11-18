//    public static void main(String[] args) {
//  
//    }
package lab12_3;


public class TransactionRecord {
    private int acctNo;
    private int transCnt;
    private double balance;
    
    public TransactionRecord(int acctNo, double balance){
        this.acctNo=acctNo;
        this.balance=balance;
        this.transCnt=1;
    }
    
    public void setAccountNumber(int acctNo){
        this.acctNo = acctNo;
    }
    
    public int getAccountNumber(){
        return acctNo;
    }
    
    public void setBalance(double balace){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public int getTransCnt() {
        return transCnt;
    }

    public void setTransCnt(int transCnt) {
        this.transCnt = transCnt;
    }
    
    @Override
    public String toString() {
        return "TransactionRecord{" +
                "acctNo=" + acctNo +
                ", balance=" + balance +
                ", transCnt=" + transCnt +
                '}';
    }
    
    
}
