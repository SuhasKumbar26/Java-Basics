package StaticKeyword;

public class BankAccount {

    /*
    Static methods and variable belongs to the class not belongs to Objects
    but Shared among every object
    */
    static float interestRate = 4;
    static String bankName = "Java Dev";

    //instance variables
    String name;
    float amount;
    double identityNo;

    //instance methods
    public void welcomeMsg(){
        System.out.println("Welcome To Our Bank");
    }

    public void Deposit(float amount){
        this.amount += amount;
    }

    public void Withdraw(float amount){
        this.amount -= amount;
    }

    public void ShowAmount(){
        System.out.println("Balance: "+amount);
    }

    public void ShowDetails(){
        System.out.println("Interest Rate: "+interestRate);
        // interestRate is static variable, but it can be accessed by no static member
        System.out.println("Name: "+name);
        System.out.println("Amount: "+amount);
        System.out.println("Identity No: "+identityNo);
    }

    public static void BankDetails(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Interest Rate: "+interestRate);
        // interestRate is also accessed by the Static method
    }

}
