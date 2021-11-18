
package lab12_3;


public class AccountRecord {
    private int acctNo;     
    private String name;     
    private double balance;     
    private int transCnt = 0; // นับว่า บัญชีนี้ทำ รายการ transaction ไปกี่ครัง้     
    
    public AccountRecord(int acctNo, String name, double balance) {
        this(acctNo, name, balance, 0);
    }
    
    public AccountRecord (int acctNo, String name, double balance, int transCnt) {         
        this.acctNo = acctNo;         
        this.name = name;         
        this.balance = balance; 
        this.transCnt = transCnt;
    }     
    public int getAcctNo()  {  
        return acctNo;   
    }     
    public String getName()  {  
        return name;  
    }     
    public double getBalance(){  
        return balance; 
    }     
    public int getTransCnt() {    
        return transCnt; 
    } 
    
    public void combine(TransactionRecord t){
        if (t.getAccountNumber() != this.acctNo) {
            return;
        }
        this.balance = balance + t.getBalance();
        this.transCnt = transCnt + t.getTransCnt();
        
    }
    @Override
    public String toString() {
        return "AccountRecord{" +
                "acctNo=" + acctNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transCnt=" + transCnt +
                '}';
    }
    
}
