package BankAccount;

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter Account member name: ");
        String name = scan.next();
        System.out.print("Enter Account No(0-9): ");
        long accountNo = scan.nextLong();
        System.out.print("Enter Deposit amount: ");
        float amount = scan.nextFloat();

        account.setName(name);
        System.out.println("Name: "+account.getName());
        account.setAccountNo(accountNo);
        System.out.println("Account no: "+account.getAccountNo());
        account.deposit(amount);
        System.out.println("Balance: "+account.getBalance());

        account.withDraw(500);
        System.out.println("Balance: "+account.getBalance());
        account.deposit(-50);
        System.out.println("Balance: "+account.getBalance());
        account.withDraw(-50);

    }
}
