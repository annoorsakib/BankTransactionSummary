
package account;


public class Account {
   
    private String accName="";
    private String acid="";
    private double balance=0.0;
    private Transaction []listOfTransaction=new Transaction[10000];
    private int totalNumberOfTransaction=0;
    
    public Account()
    {
        
    }
    
    public Account(String name,String acno,double v)
    {
        this.accName=name;
        this.acid=acno;
        this.balance=v;
    }
    
    public void deposit(double amount)
    {
        this.balance+=amount;
        Transaction t1=new Transaction(this,this,amount,"deposit");
        addTransaction(t1);
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Not enough Balance");
        }
        else
        {
            this.balance-=amount;
            Transaction t1=new Transaction(this,this,amount,"withdraw");
            addTransaction(t1);
        }
        
    }
    public void transfer(double amount ,Account receiver)
    {
        receiver.balance = receiver.balance + amount;
        this.balance = this.balance - amount;
        System.out.println("Amount Received: " + amount);
        System.out.println("Transfered to : " + receiver.accName);
        Transaction t1 = new Transaction(this,receiver,amount,"transfer");
        addTransaction(t1);
    }
    public String getAcno()
    {
        return acid;
    }
    public void showInfo()
    {
        System.out.println("account details: ");
        System.out.println("Account no: "+this.acid);
        System.out.println("A/C name: "+ this.accName);
        System.out.println("balance: "+this.balance);
    }
    
    public void addTransaction(Transaction t)
    {
        listOfTransaction[totalNumberOfTransaction]=t;
        totalNumberOfTransaction++;        
    }
    public void showAllTransaction()
    {
        for(int i=0;i<totalNumberOfTransaction;i++)
        {
            listOfTransaction[i].showTransactionInfo();
        }
    }
    
}

