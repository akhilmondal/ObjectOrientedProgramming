package com.accountmanagement;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chooseOption;
        double balance = 0;
        Accounts account = new Accounts(balance);
        do {
            System.out.println("1.Add and See balance \n2.Withdraw Amount \n3.Deposit credit balance \n4.Exit and see total balance");
            chooseOption = sc.nextInt();
            switch (chooseOption) {
                case 1:
                    System.out.print("Enter initial balance: ");
                    balance = sc.nextDouble();
                    account = new Accounts(balance);
                    System.out.println("Initial balance in your account is : " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter debit amount: ");
                    double debitAmount = sc.nextDouble();
                    account.debit(debitAmount);
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.credit(depositAmount);
                    System.out.println("Current balance: " + account.getBalance());
                    break;
            }
        } while (chooseOption != 4);
        System.out.println("Total balance: " + account.getBalance());
        sc.close();
    }
}
