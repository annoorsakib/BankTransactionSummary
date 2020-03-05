
package account;

public class Transaction {
    
    private Account sender;
    private Account receiver;
    private double amount;
    private String additionalInfo;
    
    public Transaction()
    {
        
    }
    public Transaction(Account sender,Account receiver,double amount,String additionalInfo)
    {
        this.sender=sender;
        this.receiver=receiver;
        this.amount=amount;
        this.additionalInfo=additionalInfo;
    }
    public void showTransactionInfo()
    {
        System.out.println("Sender: "+sender.getAcno());
        System.out.println("Receiver: "+receiver.getAcno());
        System.out.println("Amount: "+amount);
        System.out.println("Additional Information: "+additionalInfo);
    }
    
}
