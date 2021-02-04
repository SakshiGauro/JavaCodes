package com.superKeyword.bankAccounts;

public class BankTester
{
    public static void main(String[] args)
    {
        // Start here!
        Account obj1 = new Account("An", 125.0);
        StudentAccount obj2 = new StudentAccount("Any", 125.0);
        
        obj1.deposit(5.0);
        obj2.deposit(5.0);
        
        obj1.withdrawal(10.0);
        obj2.withdrawal(10.0);
        
        System.out.println(obj1);
        System.out.println(obj2);
        
    }
}