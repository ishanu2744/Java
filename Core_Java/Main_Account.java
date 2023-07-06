class Account{
    private int AccountNumber;
    private int Balance;
    private String HolderName;

    public Account() {
        AccountNumber =6496202;
        Balance = 10000;
        HolderName ="XYZ";
    }

    public void setAccountNumber(int accountNumber) {

        AccountNumber = accountNumber;
    }
    public void setBalance(int balance) {

        Balance = balance;
    }
    public void setHolderName(String holderName) {

        HolderName = holderName;
    }
    public int getAccountNumber() {

        return AccountNumber;
    }
    public int getBalance() {

        return Balance;
    }
    public String getHolderName() {

        return HolderName;
    }
    public void display(){}
}
class SavingsAccount extends Account{
    private int interestRate=4;
    private float calculateYearlyInterest(){
      return (getBalance()*interestRate*1)/100;
    }
    public void display(){
        System.out.println("........Savings Account........");
        System.out.println("Account Name "+this.getHolderName());
        System.out.println("Account Number "+this.getAccountNumber());
        System.out.println("Account Balance "+this.getBalance());
        System.out.println("interest Rate "+this.calculateYearlyInterest());
    }
}
class CurrentAccount extends Account{
    public void display(){
        System.out.println(".........Current Account.........");
        System.out.println("Account Name "+this.getHolderName());
        System.out.println("Account Number "+this.getAccountNumber());
        System.out.println("Account Balance "+this.getBalance());
    }
}
class Manager {
    private Account [] acc1=new SavingsAccount[2];
    private Account [] acc2=new CurrentAccount[3];
    public void SavingsAcc(){
        for (int i=0;i<2;i++){
            acc1[i]=new SavingsAccount();
        }
        acc1[0].setAccountNumber(1254);
        acc1[0].setHolderName("Harish");
        acc1[0].setBalance(35000);

        acc1[1].setAccountNumber(6789);
        acc1[1].setHolderName("Suresh");
        acc1[1].setBalance(25000);
        SavingsDisplay();
        System.out.println();
    }
    public void CurrentAcc(){
        for (int i=0;i<3;i++){
            acc2[i]=new CurrentAccount();
        }
        acc2[0].setAccountNumber(2536);
        acc2[0].setHolderName("Suman");
        acc2[0].setBalance(20000);

        acc2[1].setAccountNumber(8564);
        acc2[1].setHolderName("Akash");
        acc2[1].setBalance(15000);

        acc2[2].setAccountNumber(85789);
        acc2[2].setHolderName("Alok");
        acc2[2].setBalance(16850);
        CurrentDisplay();
    }
    public void SavingsDisplay(){
        for (int i=0;i<2;i++){
            acc1[i].display();
        }
    }
    public void CurrentDisplay(){
        for (int i=0;i<3;i++){
            acc2[i].display();
        }
    }
}

public class Main_Account {
    public static void main(String[] args) {
        Manager M1=new Manager();
        M1.SavingsAcc();
        M1.CurrentAcc();
    }
}
