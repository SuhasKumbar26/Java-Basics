package BankAccount;

public class BankAccount {
    private String name;
    private long accountNo;
    private float balance;

    public void setName(String name){
         this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAccountNo(long accountNo){
        this.accountNo = accountNo;
    }

    public long getAccountNo(){
        return this.accountNo;
    }

    public void withDraw(float amount) {
        if (amount <= 0){
            System.out.println("Can't withdraw: "+amount);
        } else if (amount >= this.balance) {
            System.out.println("You don't have enough balance: "+this.balance);
        } else this.balance -= amount;
    }

    public void deposit(float amount) {
        if (amount <= 0){
            System.out.println("Can't Deposit: "+amount);
        }else this.balance += amount;
    }

    public float getBalance() {
        return balance;
    }
}
