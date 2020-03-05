
package account;


public class MainClass {

   
    public static void main(String[] args) {
     
        Account a=new Account("Lamia","100000-1",10000.00);
        Account b=new Account("Nabila","100000-2",20000.00);
        a.transfer(5000, b);
        a.showAllTransaction();
        b.transfer(1000, a);
        b.showAllTransaction();
        a.deposit(100);
        b.withdraw(10000);
        a.showAllTransaction();
        b.showAllTransaction();
    }
    
}
