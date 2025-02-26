package StaticKeyword;

public class Customer {
    public static void main(String[] args) {

        BankAccount customer = new BankAccount();

        // static method or variable can be called by using class name
        // it doesn't create object
        System.out.println("Bank Name: "+BankAccount.bankName);
        System.out.println("Bank interest Rate: "+BankAccount.interestRate);
        System.out.println("----------------");

        customer.ShowDetails();

        System.out.println("----------------");
        //static method calling by class name
        BankAccount.BankDetails();

//      System.out.println(customer.bankName);
        /*
        * Static member 'StaticKeyword.BankAccount.bankName' accessed via instance reference
        */
    }
}
